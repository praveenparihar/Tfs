package com.tfs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tfs.dao.IssueDetailsDao;
import com.tfs.model.IssueDetails;
import com.tfs.service.IssueDetailsService;

@Service
@Transactional
public class IssueDetailsServiceImpl implements IssueDetailsService {
 
IssueDetailsDao issueDetailsDao;
 
 @Autowired
 public void setIssueDetailsDao(IssueDetailsDao IssueDetailsDao) {
  this.issueDetailsDao = IssueDetailsDao;
 }

 public List getListIssueDetails() {
  return issueDetailsDao.getListIssueDetails();
 }

 public void saveOrUpdate(IssueDetails issueDetails) {
	 issueDetailsDao.saveOrUpdate(issueDetails);
 }

 public void deleteIssueDetails(int id) {
	 issueDetailsDao.deleteIssueDetails(id);
 }

 public IssueDetails findIssueDetailsById(int id) {
  return issueDetailsDao.findIssueDetailsById(id);
 }

}