package com.tfs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tfs.dao.MasterIssueListDao;
import com.tfs.model.MasterIssueList;
import com.tfs.service.MasterIssueListService;

@Service
@Transactional
public class MasterIssueListServiceImpl implements MasterIssueListService {
 
MasterIssueListDao masterIssueListDao;
 
 @Autowired
 public void setMasterIssueListDao(MasterIssueListDao MasterIssueListDao) {
  this.masterIssueListDao = MasterIssueListDao;
 }

 public List getListMasterIssueList() {
  return masterIssueListDao.getListMasterIssueList();
 }

 public void saveOrUpdate(MasterIssueList masterIssueList) {
	 masterIssueListDao.saveOrUpdate(masterIssueList);
 }

 public void deleteMasterIssueList(int id) {
	 masterIssueListDao.deleteMasterIssueList(id);
 }

 public MasterIssueList findMasterIssueListById(int id) {
  return masterIssueListDao.findMasterIssueListById(id);
 }

}