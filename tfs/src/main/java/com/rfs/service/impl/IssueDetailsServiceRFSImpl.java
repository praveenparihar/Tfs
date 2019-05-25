package com.rfs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rfs.dao.IssueDetailsRFSDao;
import com.rfs.model.IssueDetailsRFS;
import com.rfs.service.IssueDetailsRFSService;

@Service
@Transactional
public class IssueDetailsServiceRFSImpl implements IssueDetailsRFSService {
 
IssueDetailsRFSDao issueDetailsDao;
 
 @Autowired
 public void setIssueDetailsDao(IssueDetailsRFSDao IssueDetailsDao) {
  this.issueDetailsDao = IssueDetailsDao;
 }

 public List getListIssueDetails() {
  return issueDetailsDao.getListIssueDetails();
 }

 public void saveOrUpdate(IssueDetailsRFS issueDetails) {
	 issueDetailsDao.saveOrUpdate(issueDetails);
 }

 public void deleteIssueDetails(int id) {
	 issueDetailsDao.deleteIssueDetails(id);
 }

 public IssueDetailsRFS findIssueDetailsById(int id) {
  return issueDetailsDao.findIssueDetailsById(id);
 }

}