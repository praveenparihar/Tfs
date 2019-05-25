package com.tfs.service;

import java.util.List;

import com.tfs.model.ClientDetails;

public interface ClientDetailsService {
 
 public List getListClientDetails();
 
 public void saveOrUpdate(ClientDetails rating);
 
 public void deleteClientDetails(int id);
 
 public ClientDetails findClientDetailsById(int id);
 
}