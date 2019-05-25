package com.rfs.dao;

import java.util.List;

import com.rfs.model.ClientDetailsRFS;

public interface ClientDetailsRFSDao {
 
 public List getListClientDetails();
 
 public void saveOrUpdate(ClientDetailsRFS clientDetails);
 
 public void deleteClientDetails(int id);
 
 public ClientDetailsRFS findClientDetailsById(int id);
 
}