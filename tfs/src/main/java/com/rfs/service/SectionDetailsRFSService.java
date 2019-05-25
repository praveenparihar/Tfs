package com.rfs.service;

import java.util.List;

import com.rfs.model.SectionDetailsRFS;

public interface SectionDetailsRFSService {
 
 public List getListSectionDetails();
 
 public void saveOrUpdate(SectionDetailsRFS SectionDetails);
 
 public void deleteSectionDetails(int id);
 
 public SectionDetailsRFS findSectionDetailsById(int id);
 
}