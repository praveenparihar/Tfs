package com.rfs.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rfs.dao.RatingParameterRFSDao;
import com.rfs.model.RatingParameterRFS;

@Repository
public class RatingParameterDaoRFSImpl implements RatingParameterRFSDao {
 
 @Autowired
 private SessionFactory sessionFactory;
 
 protected Session getSession(){
  return sessionFactory.getCurrentSession();
 }

 @SuppressWarnings("unchecked")
 public List getListRatingParameter() {
  Criteria criteria = getSession().createCriteria(RatingParameterRFS.class);
  
  return (List) criteria.list();
 }

 public void saveOrUpdate(RatingParameterRFS ratingParameter) {
  getSession().saveOrUpdate(ratingParameter);
 }

 public void deleteRatingParameter(int id) {
	 RatingParameterRFS ratingParameter = (RatingParameterRFS) getSession().get(RatingParameterRFS.class, id);
  getSession().delete(ratingParameter);
 }

 public RatingParameterRFS findRatingParameterById(int id) {
  return (RatingParameterRFS) getSession().get(RatingParameterRFS.class, id);
 }

}