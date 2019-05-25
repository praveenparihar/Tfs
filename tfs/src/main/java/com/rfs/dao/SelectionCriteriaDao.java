package com.rfs.dao;

import java.util.List;

import com.rfs.model.SelectionCriteria;

public interface SelectionCriteriaDao {
 
 public List getListSelectionCriteria();
 
 public void saveOrUpdate(SelectionCriteria selectionCriteria);
 
 public void deleteSelectionCriteria(int id);
 
 public SelectionCriteria findSelectionCriteriaById(int id);
 
}