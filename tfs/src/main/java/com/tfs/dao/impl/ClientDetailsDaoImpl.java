package com.tfs.dao.impl;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tfs.dao.ClientDetailsDao;
import com.tfs.model.ClientDetails;

@Repository
public class ClientDetailsDaoImpl implements ClientDetailsDao {
 
 @Autowired
 private SessionFactory sessionFactory;
 
 protected Session getSession(){
  return sessionFactory.getCurrentSession();
 }

 public List getListClientDetails() {
  Criteria criteria = getSession().createCriteria(ClientDetails.class);
  
  return (List) criteria.list();
 }

 public void saveOrUpdate(ClientDetails clientDetails) {
  getSession().saveOrUpdate(clientDetails);
 }

 public void deleteClientDetails(int id) {
	 ClientDetails clientDetails = (ClientDetails) getSession().get(ClientDetails.class, id);
  getSession().delete(clientDetails);
 }

 public ClientDetails findClientDetailsById(int id) {
  return (ClientDetails) getSession().get(ClientDetails.class, id);
 }

 public static void main(String[] args) {
	 ClientDetails clientDetails=new ClientDetails();
	 clientDetails.setCreationTime(new Date());
	 clientDetails.setCreatedBy("Amrit.baghel");
	 clientDetails.setName("Amrit baghel");
	 clientDetails.setDelFlag("false");
	 clientDetails.setLogo("xyz");
	 clientDetails.setUpdatedTime(new Date());
	 clientDetails.setDescrp("test");
	new ClientDetailsDaoImpl().saveOrUpdate(clientDetails);
	System.out.println("Done");
}
 
}