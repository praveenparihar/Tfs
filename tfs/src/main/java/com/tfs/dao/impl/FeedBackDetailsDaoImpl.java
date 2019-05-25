package com.tfs.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tfs.dao.FeedBackDetailsDao;
import com.tfs.model.FeedBackDetails;
import com.tfs.model.FeedBackRating;

@Repository
public class FeedBackDetailsDaoImpl implements FeedBackDetailsDao {
 
 @Autowired
 private SessionFactory sessionFactory;
 
 protected Session getSession(){
  return sessionFactory.getCurrentSession();
 }

 @SuppressWarnings("unchecked")
 public List getListFeedBackDetails() {
  Criteria criteria = getSession().createCriteria(FeedBackDetails.class);
  
  return (List) criteria.list();
 }

 public void saveOrUpdate(FeedBackDetails feedBackDetails) {
	 Session s = sessionFactory.openSession();
	 Transaction tx=s.beginTransaction();
     s.save(feedBackDetails);
tx.commit();
s.close();
	 
//  getSession().saveOrUpdate(feedBackDetails);
  /*for(FeedBackRating fr : feedBackDetails.getFeedBackRatings()){
	 getSession().saveOrUpdate(fr); 
  }*/
 }

 public void deleteFeedBackDetails(int id) {
	 FeedBackDetails feedBackDetails = (FeedBackDetails) getSession().get(FeedBackDetails.class, id);
  getSession().delete(feedBackDetails);
 }

 public FeedBackDetails findFeedBackDetailsById(int id) {
  return (FeedBackDetails) getSession().get(FeedBackDetails.class, id);
 }

}