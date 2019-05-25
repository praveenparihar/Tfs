package com.tfs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tfs.dao.RatingParameterDao;
import com.tfs.model.RatingParameter;
import com.tfs.service.RatingParameterService;

@Service
@Transactional
public class RatingParameterServiceImpl implements RatingParameterService {
 
RatingParameterDao ratingParameterDao;
 
 @Autowired
 public void setRatingParameterDao(RatingParameterDao ratingParameterDao) {
  this.ratingParameterDao = ratingParameterDao;
 }

 public List getListRatingParameter() {
  return ratingParameterDao.getListRatingParameter();
 }

 public void saveOrUpdate(RatingParameter ratingParameter) {
	 ratingParameterDao.saveOrUpdate(ratingParameter);
 }

 public void deleteRatingParameter(int id) {
	 ratingParameterDao.deleteRatingParameter(id);
 }

 public RatingParameter findRatingParameterById(int id) {
  return ratingParameterDao.findRatingParameterById(id);
 }

}