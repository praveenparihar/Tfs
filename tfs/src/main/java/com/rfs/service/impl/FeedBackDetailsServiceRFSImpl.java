package com.rfs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rfs.dao.FeedBackDetailsRFSDao;
import com.rfs.model.FeedBackDetailsRFS;
import com.rfs.service.FeedBackDetailsRFSService;

@Service
@Transactional
public class FeedBackDetailsServiceRFSImpl implements FeedBackDetailsRFSService {
 
FeedBackDetailsRFSDao feedBackDetailsDao;
 
 @Autowired
 public void setFeedBackDetailsDao(FeedBackDetailsRFSDao FeedBackDetailsDao) {
  this.feedBackDetailsDao = FeedBackDetailsDao;
 }

 public List getListFeedBackDetails() {
	 
	/* List <FeedBackDetails>fsList = feedBackDetailsDao.getListFeedBackDetails();
  
	 for(FeedBackDetails fs : fsList){
		 
		 for()
		 
		 
	 }*/
	 
	 return feedBackDetailsDao.getListFeedBackDetails();
  
  
  
  
 }

 public void saveOrUpdate(FeedBackDetailsRFS feedBackDetails) {
	 feedBackDetailsDao.saveOrUpdate(feedBackDetails);
 }

 public void deleteFeedBackDetails(int id) {
	 feedBackDetailsDao.deleteFeedBackDetails(id);
 }

 public FeedBackDetailsRFS findFeedBackDetailsById(int id) {
  return feedBackDetailsDao.findFeedBackDetailsById(id);
 }

}