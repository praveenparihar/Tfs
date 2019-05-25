package com.tfs.dao;

import java.util.List;

import com.tfs.model.FeedBackDetails;

public interface FeedBackDetailsDao {
 
 public List getListFeedBackDetails();
 
 public void saveOrUpdate(FeedBackDetails feedBackDetails);
 
 public void deleteFeedBackDetails(int id);
 
 public FeedBackDetails findFeedBackDetailsById(int id);
 
}