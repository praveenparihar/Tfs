package com.rfs.dao;

import java.util.List;

import com.rfs.model.MasterIssueListRFS;

public interface MasterIssueListRFSDao {
 
 public List getListMasterIssueList();
 
 public void saveOrUpdate(MasterIssueListRFS masterIssueList);
 
 public void deleteMasterIssueList(int id);
 
 public MasterIssueListRFS findMasterIssueListById(int id);
 
}