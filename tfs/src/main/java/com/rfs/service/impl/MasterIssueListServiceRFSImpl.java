package com.rfs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rfs.dao.MasterIssueListRFSDao;
import com.rfs.model.MasterIssueListRFS;
import com.rfs.service.MasterIssueListRFSService;

@Service
@Transactional
public class MasterIssueListServiceRFSImpl implements MasterIssueListRFSService {
 
MasterIssueListRFSDao masterIssueListDao;
 
 @Autowired
 public void setMasterIssueListDao(MasterIssueListRFSDao MasterIssueListDao) {
  this.masterIssueListDao = MasterIssueListDao;
 }

 public List getListMasterIssueList() {
  return masterIssueListDao.getListMasterIssueList();
 }

 public void saveOrUpdate(MasterIssueListRFS masterIssueList) {
	 masterIssueListDao.saveOrUpdate(masterIssueList);
 }

 public void deleteMasterIssueList(int id) {
	 masterIssueListDao.deleteMasterIssueList(id);
 }

 public MasterIssueListRFS findMasterIssueListById(int id) {
  return masterIssueListDao.findMasterIssueListById(id);
 }

}