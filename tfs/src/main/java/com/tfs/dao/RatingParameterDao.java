package com.tfs.dao;

import java.util.List;

import com.tfs.model.RatingParameter;

public interface RatingParameterDao {
 
 public List getListRatingParameter();
 
 public void saveOrUpdate(RatingParameter ratingParameter);
 
 public void deleteRatingParameter(int id);
 
 public RatingParameter findRatingParameterById(int id);
 
}