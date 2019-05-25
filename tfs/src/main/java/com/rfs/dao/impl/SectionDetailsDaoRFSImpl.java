package com.rfs.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rfs.dao.SectionDetailsRFSDao;
import com.rfs.model.SectionDetailsRFS;

@Repository
public class SectionDetailsDaoRFSImpl implements SectionDetailsRFSDao {
 
 @Autowired
 private SessionFactory sessionFactory;
 
 protected Session getSession(){
  return sessionFactory.getCurrentSession();
 }

 @SuppressWarnings("unchecked")
 public List getListSectionDetails() {
  Criteria criteria = getSession().createCriteria(SectionDetailsRFS.class);
  
  return (List) criteria.list();
 }

 public void saveOrUpdate(SectionDetailsRFS SectionDetails) {
  getSession().saveOrUpdate(SectionDetails);
 }

 public void deleteSectionDetails(int id) {
	 SectionDetailsRFS SectionDetails = (SectionDetailsRFS) getSession().get(SectionDetailsRFS.class, id);
  getSession().delete(SectionDetails);
 }

 public SectionDetailsRFS findSectionDetailsById(int id) {
  return (SectionDetailsRFS) getSession().get(SectionDetailsRFS.class, id);
 }

}