package com.tfs.service;

import java.util.List;

import com.tfs.model.IssueDetails;

public interface IssueDetailsService {
 
 public List getListIssueDetails();
 
 public void saveOrUpdate(IssueDetails issueDetails);
 
 public void deleteIssueDetails(int id);
 
 public IssueDetails findIssueDetailsById(int id);
 
}