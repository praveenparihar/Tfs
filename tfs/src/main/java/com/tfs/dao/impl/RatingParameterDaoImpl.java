package com.tfs.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tfs.dao.RatingParameterDao;
import com.tfs.dao.UserDao;
import com.tfs.model.RatingParameter;
import com.tfs.model.User;

@Repository
public class RatingParameterDaoImpl implements RatingParameterDao {
 
 @Autowired
 private SessionFactory sessionFactory;
 
 protected Session getSession(){
  return sessionFactory.getCurrentSession();
 }

 @SuppressWarnings("unchecked")
 public List getListRatingParameter() {
  Criteria criteria = getSession().createCriteria(RatingParameter.class);
  
  return (List) criteria.list();
 }

 public void saveOrUpdate(RatingParameter ratingParameter) {
  getSession().saveOrUpdate(ratingParameter);
 }

 public void deleteRatingParameter(int id) {
	 RatingParameter ratingParameter = (RatingParameter) getSession().get(RatingParameter.class, id);
  getSession().delete(ratingParameter);
 }

 public RatingParameter findRatingParameterById(int id) {
  return (RatingParameter) getSession().get(RatingParameter.class, id);
 }

}