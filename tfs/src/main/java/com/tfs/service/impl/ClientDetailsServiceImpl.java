package com.tfs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tfs.dao.ClientDetailsDao;
import com.tfs.model.ClientDetails;
import com.tfs.service.ClientDetailsService;

@Service
@Transactional
public class ClientDetailsServiceImpl implements ClientDetailsService {
 
ClientDetailsDao clientDetailsDao;
 
 @Autowired
 public void setClientDetailsDao(ClientDetailsDao ClientDetailsDao) {
  this.clientDetailsDao = ClientDetailsDao;
 }

 public List getListClientDetails() {
  return clientDetailsDao.getListClientDetails();
 }

 public void saveOrUpdate(ClientDetails clientDetails) {
	 clientDetailsDao.saveOrUpdate(clientDetails);
 }

 public void deleteClientDetails(int id) {
	 clientDetailsDao.deleteClientDetails(id);
 }

 public ClientDetails findClientDetailsById(int id) {
  return clientDetailsDao.findClientDetailsById(id);
 }

}