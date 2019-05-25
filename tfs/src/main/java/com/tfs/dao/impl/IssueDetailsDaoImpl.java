package com.tfs.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tfs.dao.IssueDetailsDao;
import com.tfs.model.IssueDetails;
//import com.tfs.model.IssueRating;

@Repository
public class IssueDetailsDaoImpl implements IssueDetailsDao {
 
 @Autowired
 private SessionFactory sessionFactory;
 
 protected Session getSession(){
  return sessionFactory.getCurrentSession();
 }

 @SuppressWarnings("unchecked")
 public List getListIssueDetails() {
  Criteria criteria = getSession().createCriteria(IssueDetails.class);
  
  return (List) criteria.list();
 }

 public void saveOrUpdate(IssueDetails issueDetails) {
	 Session s = sessionFactory.openSession();
	 Transaction tx=s.beginTransaction();
     s.save(issueDetails);
tx.commit();
s.close();
	 
//  getSession().saveOrUpdate(issueDetails);
  /*for(IssueRating fr : issueDetails.getIssueRatings()){
	 getSession().saveOrUpdate(fr); 
  }*/
 }

 public void deleteIssueDetails(int id) {
	 IssueDetails issueDetails = (IssueDetails) getSession().get(IssueDetails.class, id);
  getSession().delete(issueDetails);
 }

 public IssueDetails findIssueDetailsById(int id) {
  return (IssueDetails) getSession().get(IssueDetails.class, id);
 }

}