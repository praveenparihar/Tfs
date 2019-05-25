package com.tfs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tfs.dao.FeedBackDetailsDao;
import com.tfs.model.FeedBackDetails;
import com.tfs.service.FeedBackDetailsService;

@Service
@Transactional
public class FeedBackDetailsServiceImpl implements FeedBackDetailsService {
 
FeedBackDetailsDao feedBackDetailsDao;
 
 @Autowired
 public void setFeedBackDetailsDao(FeedBackDetailsDao FeedBackDetailsDao) {
  this.feedBackDetailsDao = FeedBackDetailsDao;
 }

 public List getListFeedBackDetails() {
	 
	/* List <FeedBackDetails>fsList = feedBackDetailsDao.getListFeedBackDetails();
  
	 for(FeedBackDetails fs : fsList){
		 
		 for()
		 
		 
	 }*/
	 
	 return feedBackDetailsDao.getListFeedBackDetails();
  
  
  
  
 }

 public void saveOrUpdate(FeedBackDetails feedBackDetails) {
	 feedBackDetailsDao.saveOrUpdate(feedBackDetails);
 }

 public void deleteFeedBackDetails(int id) {
	 feedBackDetailsDao.deleteFeedBackDetails(id);
 }

 public FeedBackDetails findFeedBackDetailsById(int id) {
  return feedBackDetailsDao.findFeedBackDetailsById(id);
 }

}