package com.tfs.dao;

import java.util.List;

import com.tfs.model.MachineDetails;

public interface MachineDetailsDao {
 
 public List getListMachineDetails();
 
 public void saveOrUpdate(MachineDetails machineDetails);
 
 public void deleteMachineDetails(int id);
 
 public MachineDetails findMachineDetailsById(int id);
 
}