package com.rfs.service;

import java.util.List;

import com.rfs.model.ClientDetailsRFS;

public interface ClientDetailsRFSService {
 
 public List getListClientDetails();
 
 public void saveOrUpdate(ClientDetailsRFS rating);
 
 public void deleteClientDetails(int id);
 
 public ClientDetailsRFS findClientDetailsById(int id);
 
}