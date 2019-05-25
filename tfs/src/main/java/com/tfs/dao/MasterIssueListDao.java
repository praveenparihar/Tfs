package com.tfs.dao;

import java.util.List;

import com.tfs.model.MasterIssueList;

public interface MasterIssueListDao {
 
 public List getListMasterIssueList();
 
 public void saveOrUpdate(MasterIssueList masterIssueList);
 
 public void deleteMasterIssueList(int id);
 
 public MasterIssueList findMasterIssueListById(int id);
 
}