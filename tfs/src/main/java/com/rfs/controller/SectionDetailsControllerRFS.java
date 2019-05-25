package com.rfs.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rfs.model.SectionDetailsRFS;
import com.rfs.service.SectionDetailsRFSService;

@RestController
@RequestMapping("/RFS/sectionDetails")
public class SectionDetailsControllerRFS {
	
	
	@Autowired
	 SectionDetailsRFSService SectionDetailsService;

	 
	 @RequestMapping(value="/", method=RequestMethod.GET, headers="Accept=application/json")
	 public @ResponseBody List getListSectionDetails(){
	  List SectionDetailss = SectionDetailsService.getListSectionDetails();
	  
	  return SectionDetailss;
	 }
	 
	 @RequestMapping(value="/add", method=RequestMethod.PUT)
	 public @ResponseBody SectionDetailsRFS add(@RequestBody SectionDetailsRFS sectionDetails){
		 Date currentDate= new Date();
		 sectionDetails.setCreationTime(currentDate);
	  SectionDetailsService.saveOrUpdate(sectionDetails);
	  
	  return sectionDetails;
	 }
	 
	
	 
	 
	 @RequestMapping(value="/update/{id}", method=RequestMethod.PUT)
	 public @ResponseBody SectionDetailsRFS update(@PathVariable("id") int id, @RequestBody SectionDetailsRFS SectionDetails){
		 SectionDetails.setSectionId(id);
	  SectionDetailsService.saveOrUpdate(SectionDetails);
	  
	  return SectionDetails;
	 }
	 
	 @RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	 public @ResponseBody SectionDetailsRFS delete(@PathVariable("id") int id){
		 SectionDetailsRFS SectionDetails = SectionDetailsService.findSectionDetailsById(id);
	  SectionDetailsService.deleteSectionDetails(id);
	  
	  return SectionDetails;
	 }
	
}
