package com.tfs.dao;

import java.util.List;

import com.tfs.model.IssueDetails;

public interface IssueDetailsDao {
 
 public List getListIssueDetails();
 
 public void saveOrUpdate(IssueDetails issueDetails);
 
 public void deleteIssueDetails(int id);
 
 public IssueDetails findIssueDetailsById(int id);
 
}