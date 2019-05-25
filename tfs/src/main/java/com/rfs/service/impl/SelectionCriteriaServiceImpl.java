package com.rfs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rfs.dao.SelectionCriteriaDao;
import com.rfs.model.SelectionCriteria;
import com.rfs.service.SelectionCriteriaService;

@Service
@Transactional
public class SelectionCriteriaServiceImpl implements SelectionCriteriaService {
 
SelectionCriteriaDao SelectionCriteriaDao;
 
 @Autowired
 public void setSelectionCriteriaDao(SelectionCriteriaDao SelectionCriteriaDao) {
  this.SelectionCriteriaDao = SelectionCriteriaDao;
 }

 public List getListSelectionCriteria() {
  return SelectionCriteriaDao.getListSelectionCriteria();
 }

 public void saveOrUpdate(SelectionCriteria SelectionCriteria) {
	 SelectionCriteriaDao.saveOrUpdate(SelectionCriteria);
 }

 public void deleteSelectionCriteria(int id) {
	 SelectionCriteriaDao.deleteSelectionCriteria(id);
 }

 public SelectionCriteria findSelectionCriteriaById(int id) {
  return SelectionCriteriaDao.findSelectionCriteriaById(id);
 }

}