package com.rfs.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rfs.dao.ClientDetailsRFSDao;
import com.rfs.model.ClientDetailsRFS;

@Repository
public class ClientDetailsDaoRFSImpl implements ClientDetailsRFSDao {
 
 @Autowired
 private SessionFactory sessionFactory;
 
 protected Session getSession(){
  return sessionFactory.getCurrentSession();
 }

 @SuppressWarnings("unchecked")
 public List getListClientDetails() {
  Criteria criteria = getSession().createCriteria(ClientDetailsRFS.class);
  
  return (List) criteria.list();
 }

 public void saveOrUpdate(ClientDetailsRFS clientDetails) {
  getSession().saveOrUpdate(clientDetails);
 }

 public void deleteClientDetails(int id) {
	 ClientDetailsRFS clientDetails = (ClientDetailsRFS) getSession().get(ClientDetailsRFS.class, id);
  getSession().delete(clientDetails);
 }

 public ClientDetailsRFS findClientDetailsById(int id) {
  return (ClientDetailsRFS) getSession().get(ClientDetailsRFS.class, id);
 }

}