package com.rfs.dao;

import java.util.List;

import com.rfs.model.FeedBackDetailsRFS;

public interface FeedBackDetailsRFSDao {
 
 public List getListFeedBackDetails();
 
 public void saveOrUpdate(FeedBackDetailsRFS feedBackDetails);
 
 public void deleteFeedBackDetails(int id);
 
 public FeedBackDetailsRFS findFeedBackDetailsById(int id);
 
}