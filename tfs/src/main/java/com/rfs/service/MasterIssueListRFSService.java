package com.rfs.service;

import java.util.List;

import com.rfs.model.MasterIssueListRFS;

public interface MasterIssueListRFSService {
 
 public List getListMasterIssueList();
 
 public void saveOrUpdate(MasterIssueListRFS rating);
 
 public void deleteMasterIssueList(int id);
 
 public MasterIssueListRFS findMasterIssueListById(int id);
 
}