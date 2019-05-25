package com.rfs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rfs.dao.RatingParameterRFSDao;
import com.rfs.model.RatingParameterRFS;
import com.rfs.service.RatingParameterRFSService;

@Service
@Transactional
public class RatingParameterServiceRFSImpl implements RatingParameterRFSService {
 
RatingParameterRFSDao ratingParameterDao;
 
 @Autowired
 public void setRatingParameterDao(RatingParameterRFSDao ratingParameterDao) {
  this.ratingParameterDao = ratingParameterDao;
 }

 public List getListRatingParameter() {
  return ratingParameterDao.getListRatingParameter();
 }

 public void saveOrUpdate(RatingParameterRFS ratingParameter) {
	 ratingParameterDao.saveOrUpdate(ratingParameter);
 }

 public void deleteRatingParameter(int id) {
	 ratingParameterDao.deleteRatingParameter(id);
 }

 public RatingParameterRFS findRatingParameterById(int id) {
  return ratingParameterDao.findRatingParameterById(id);
 }

}