package com.rfs.service;

import java.util.List;

import com.rfs.model.SelectionCriteria;

public interface SelectionCriteriaService {
 
 public List getListSelectionCriteria();
 
 public void saveOrUpdate(SelectionCriteria SelectionCriteria);
 
 public void deleteSelectionCriteria(int id);
 
 public SelectionCriteria findSelectionCriteriaById(int id);
 
}