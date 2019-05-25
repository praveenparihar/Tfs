package com.rfs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rfs.dao.ClientDetailsRFSDao;
import com.rfs.model.ClientDetailsRFS;
import com.rfs.service.ClientDetailsRFSService;

@Service
@Transactional
public class ClientDetailsServiceRFSImpl implements ClientDetailsRFSService {
 
ClientDetailsRFSDao clientDetailsDao;
 
 @Autowired
 public void setClientDetailsDao(ClientDetailsRFSDao ClientDetailsDao) {
  this.clientDetailsDao = ClientDetailsDao;
 }

 public List getListClientDetails() {
  return clientDetailsDao.getListClientDetails();
 }

 public void saveOrUpdate(ClientDetailsRFS clientDetails) {
	 clientDetailsDao.saveOrUpdate(clientDetails);
 }

 public void deleteClientDetails(int id) {
	 clientDetailsDao.deleteClientDetails(id);
 }

 public ClientDetailsRFS findClientDetailsById(int id) {
  return clientDetailsDao.findClientDetailsById(id);
 }

}