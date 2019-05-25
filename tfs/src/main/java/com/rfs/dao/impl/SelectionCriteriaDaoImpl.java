package com.rfs.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rfs.dao.SelectionCriteriaDao;
import com.rfs.model.SelectionCriteria;

@Repository
public class SelectionCriteriaDaoImpl implements SelectionCriteriaDao {
 
 @Autowired
 private SessionFactory sessionFactory;
 
 protected Session getSession(){
  return sessionFactory.getCurrentSession();
 }

 @SuppressWarnings("unchecked")
 public List getListSelectionCriteria() {
  Criteria criteria = getSession().createCriteria(SelectionCriteria.class);
  
  return (List) criteria.list();
 }

 public void saveOrUpdate(SelectionCriteria SelectionCriteria) {
  getSession().saveOrUpdate(SelectionCriteria);
 }

 public void deleteSelectionCriteria(int id) {
	 SelectionCriteria SelectionCriteria = (SelectionCriteria) getSession().get(SelectionCriteria.class, id);
  getSession().delete(SelectionCriteria);
 }

 public SelectionCriteria findSelectionCriteriaById(int id) {
  return (SelectionCriteria) getSession().get(SelectionCriteria.class, id);
 }

}