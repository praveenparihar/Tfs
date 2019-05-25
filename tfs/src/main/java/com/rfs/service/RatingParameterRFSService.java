package com.rfs.service;

import java.util.List;

import com.rfs.model.RatingParameterRFS;

public interface RatingParameterRFSService {
 
 public List getListRatingParameter();
 
 public void saveOrUpdate(RatingParameterRFS rating);
 
 public void deleteRatingParameter(int id);
 
 public RatingParameterRFS findRatingParameterById(int id);
 
}