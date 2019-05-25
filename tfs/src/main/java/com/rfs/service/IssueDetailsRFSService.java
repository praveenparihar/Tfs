package com.rfs.service;

import java.util.List;

import com.rfs.model.IssueDetailsRFS;

public interface IssueDetailsRFSService {
 
 public List getListIssueDetails();
 
 public void saveOrUpdate(IssueDetailsRFS issueDetails);
 
 public void deleteIssueDetails(int id);
 
 public IssueDetailsRFS findIssueDetailsById(int id);
 
}