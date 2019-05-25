package com.tfs.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tfs.dao.MachineDetailsDao;
import com.tfs.model.MachineDetails;

@Repository
public class MachineDetailsDaoImpl implements MachineDetailsDao {
 
 @Autowired
 private SessionFactory sessionFactory;
 
 protected Session getSession(){
  return sessionFactory.getCurrentSession();
 }

 @SuppressWarnings("unchecked")
 public List getListMachineDetails() {
  Criteria criteria = getSession().createCriteria(MachineDetails.class);
  
  return (List) criteria.list();
 }

 public void saveOrUpdate(MachineDetails machineDetails) {
  getSession().saveOrUpdate(machineDetails);
 }

 public void deleteMachineDetails(int id) {
	 MachineDetails machineDetails = (MachineDetails) getSession().get(MachineDetails.class, id);
  getSession().delete(machineDetails);
 }

 public MachineDetails findMachineDetailsById(int id) {
  return (MachineDetails) getSession().get(MachineDetails.class, id);
 }

}