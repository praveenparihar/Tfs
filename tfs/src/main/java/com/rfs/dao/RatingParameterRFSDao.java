package com.rfs.dao;

import java.util.List;

import com.rfs.model.RatingParameterRFS;

public interface RatingParameterRFSDao {
 
 public List getListRatingParameter();
 
 public void saveOrUpdate(RatingParameterRFS ratingParameter);
 
 public void deleteRatingParameter(int id);
 
 public RatingParameterRFS findRatingParameterById(int id);
 
}