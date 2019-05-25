package com.rfs.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rfs.dao.FeedBackDetailsRFSDao;
import com.rfs.model.FeedBackDetailsRFS;
import com.rfs.model.FeedBackRatingRFS;

@Repository
public class FeedBackDetailsDaoRFSImpl implements FeedBackDetailsRFSDao {
 
 @Autowired
 private SessionFactory sessionFactory;
 
 protected Session getSession(){
  return sessionFactory.getCurrentSession();
 }

 @SuppressWarnings("unchecked")
 public List getListFeedBackDetails() {
  Criteria criteria = getSession().createCriteria(FeedBackDetailsRFS.class);
  
  return (List) criteria.list();
 }

 public void saveOrUpdate(FeedBackDetailsRFS feedBackDetails) {
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
	 FeedBackDetailsRFS feedBackDetails = (FeedBackDetailsRFS) getSession().get(FeedBackDetailsRFS.class, id);
  getSession().delete(feedBackDetails);
 }

 public FeedBackDetailsRFS findFeedBackDetailsById(int id) {
  return (FeedBackDetailsRFS) getSession().get(FeedBackDetailsRFS.class, id);
 }

}