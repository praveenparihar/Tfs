package com.rfs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rfs.dao.SectionDetailsRFSDao;
import com.rfs.model.SectionDetailsRFS;
import com.rfs.service.SectionDetailsRFSService;

@Service
@Transactional
public class SectionDetailsServiceRFSImpl implements SectionDetailsRFSService {
 
SectionDetailsRFSDao SectionDetailsDao;
 
 @Autowired
 public void setSectionDetailsDao(SectionDetailsRFSDao SectionDetailsDao) {
  this.SectionDetailsDao = SectionDetailsDao;
 }

 public List getListSectionDetails() {
  return SectionDetailsDao.getListSectionDetails();
 }

 public void saveOrUpdate(SectionDetailsRFS SectionDetails) {
	 SectionDetailsDao.saveOrUpdate(SectionDetails);
 }

 public void deleteSectionDetails(int id) {
	 SectionDetailsDao.deleteSectionDetails(id);
 }

 public SectionDetailsRFS findSectionDetailsById(int id) {
  return SectionDetailsDao.findSectionDetailsById(id);
 }

}