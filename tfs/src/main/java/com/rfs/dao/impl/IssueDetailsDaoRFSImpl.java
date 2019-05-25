package com.rfs.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rfs.dao.IssueDetailsRFSDao;
import com.rfs.model.IssueDetailsRFS;
//import com.tfs.model.IssueRating;

@Repository
public class IssueDetailsDaoRFSImpl implements IssueDetailsRFSDao {
 
 @Autowired
 private SessionFactory sessionFactory;
 
 protected Session getSession(){
  return sessionFactory.getCurrentSession();
 }

 @SuppressWarnings("unchecked")
 public List getListIssueDetails() {
  Criteria criteria = getSession().createCriteria(IssueDetailsRFS.class);
  
  return (List) criteria.list();
 }

 public void saveOrUpdate(IssueDetailsRFS issueDetails) {
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
	 IssueDetailsRFS issueDetails = (IssueDetailsRFS) getSession().get(IssueDetailsRFS.class, id);
  getSession().delete(issueDetails);
 }

 public IssueDetailsRFS findIssueDetailsById(int id) {
  return (IssueDetailsRFS) getSession().get(IssueDetailsRFS.class, id);
 }

}