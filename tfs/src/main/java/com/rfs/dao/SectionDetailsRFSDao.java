package com.rfs.dao;

import java.util.List;

import com.rfs.model.SectionDetailsRFS;

public interface SectionDetailsRFSDao {
 
 public List getListSectionDetails();
 
 public void saveOrUpdate(SectionDetailsRFS sectionDetails);
 
 public void deleteSectionDetails(int id);
 
 public SectionDetailsRFS findSectionDetailsById(int id);
 
}