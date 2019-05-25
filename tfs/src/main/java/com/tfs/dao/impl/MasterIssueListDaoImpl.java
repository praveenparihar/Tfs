package com.tfs.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tfs.dao.MasterIssueListDao;
import com.tfs.model.MasterIssueList;

@Repository
public class MasterIssueListDaoImpl implements MasterIssueListDao {
 
 @Autowired
 private SessionFactory sessionFactory;
 
 protected Session getSession(){
  return sessionFactory.getCurrentSession();
 }

 @SuppressWarnings("unchecked")
 public List getListMasterIssueList() {
  Criteria criteria = getSession().createCriteria(MasterIssueList.class);
  
  return (List) criteria.list();
 }

 public void saveOrUpdate(MasterIssueList masterIssueList) {
  getSession().saveOrUpdate(masterIssueList);
 }

 public void deleteMasterIssueList(int id) {
	 MasterIssueList masterIssueList = (MasterIssueList) getSession().get(MasterIssueList.class, id);
  getSession().delete(masterIssueList);
 }

 public MasterIssueList findMasterIssueListById(int id) {
  return (MasterIssueList) getSession().get(MasterIssueList.class, id);
 }

}