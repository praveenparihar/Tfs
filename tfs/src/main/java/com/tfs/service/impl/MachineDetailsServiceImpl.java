package com.tfs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tfs.dao.MachineDetailsDao;
import com.tfs.model.MachineDetails;
import com.tfs.service.MachineDetailsService;

@Service
@Transactional
public class MachineDetailsServiceImpl implements MachineDetailsService {
 
MachineDetailsDao machineDetailsDao;
 
 @Autowired
 public void setMachineDetailsDao(MachineDetailsDao MachineDetailsDao) {
  this.machineDetailsDao = MachineDetailsDao;
 }

 public List getListMachineDetails() {
  return machineDetailsDao.getListMachineDetails();
 }

 public void saveOrUpdate(MachineDetails machineDetails) {
	 machineDetailsDao.saveOrUpdate(machineDetails);
 }

 public void deleteMachineDetails(int id) {
	 machineDetailsDao.deleteMachineDetails(id);
 }

 public MachineDetails findMachineDetailsById(int id) {
  return machineDetailsDao.findMachineDetailsById(id);
 }

}