package com.tfs.service;

import java.util.List;

import com.tfs.model.MasterIssueList;

public interface MasterIssueListService {
 
 public List getListMasterIssueList();
 
 public void saveOrUpdate(MasterIssueList rating);
 
 public void deleteMasterIssueList(int id);
 
 public MasterIssueList findMasterIssueListById(int id);
 
}