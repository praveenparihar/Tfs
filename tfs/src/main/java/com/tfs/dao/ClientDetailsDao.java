package com.tfs.dao;

import java.util.List;

import com.tfs.model.ClientDetails;

public interface ClientDetailsDao {
 
 public List getListClientDetails();
 
 public void saveOrUpdate(ClientDetails clientDetails);
 
 public void deleteClientDetails(int id);
 
 public ClientDetails findClientDetailsById(int id);
 
}