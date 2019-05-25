package com.rfs.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rfs.dao.MasterIssueListRFSDao;
import com.rfs.model.MasterIssueListRFS;

@Repository
public class MasterIssueListDaoRFSImpl implements MasterIssueListRFSDao {
 
 @Autowired
 private SessionFactory sessionFactory;
 
 protected Session getSession(){
  return sessionFactory.getCurrentSession();
 }

 @SuppressWarnings("unchecked")
 public List getListMasterIssueList() {
  Criteria criteria = getSession().createCriteria(MasterIssueListRFS.class);
  
  return (List) criteria.list();
 }

 public void saveOrUpdate(MasterIssueListRFS masterIssueList) {
  getSession().saveOrUpdate(masterIssueList);
 }

 public void deleteMasterIssueList(int id) {
	 MasterIssueListRFS masterIssueList = (MasterIssueListRFS) getSession().get(MasterIssueListRFS.class, id);
  getSession().delete(masterIssueList);
 }

 public MasterIssueListRFS findMasterIssueListById(int id) {
  return (MasterIssueListRFS) getSession().get(MasterIssueListRFS.class, id);
 }

}