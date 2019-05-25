package com.tfs.service;

import java.util.List;

import com.tfs.model.RatingParameter;

public interface RatingParameterService {
 
 public List getListRatingParameter();
 
 public void saveOrUpdate(RatingParameter rating);
 
 public void deleteRatingParameter(int id);
 
 public RatingParameter findRatingParameterById(int id);
 
}