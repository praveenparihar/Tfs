package com.tfs.dao;

import java.util.List;

import com.tfs.model.FeedBackRating;

public interface FeedBackRatingDao {
 
 public List<FeedBackRating> getListFeedBackRating();
 
 public void saveOrUpdate(FeedBackRating feedbackRating);
 
 public void deleteFeedBackDetails(int id);
}