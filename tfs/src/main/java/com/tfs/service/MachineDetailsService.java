package com.tfs.service;

import java.util.List;

import com.tfs.model.MachineDetails;

public interface MachineDetailsService {
 
 public List getListMachineDetails();
 
 public void saveOrUpdate(MachineDetails machineDetails);
 
 public void deleteMachineDetails(int id);
 
 public MachineDetails findMachineDetailsById(int id);
 
}