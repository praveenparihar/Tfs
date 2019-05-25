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

import com.rfs.model.IssueDetailsRFS;
import com.rfs.service.IssueDetailsRFSService;

@RestController
@RequestMapping("/RFS/issueDetails")
public class IssueDetailsControllerRFS {
	
	
	@Autowired
	 IssueDetailsRFSService issueDetailsService;

	 
	 @RequestMapping(value="/", method=RequestMethod.GET, headers="Accept=application/json")
	 public @ResponseBody List getListIssueDetails(){
	  List issueDetailss = issueDetailsService.getListIssueDetails();
	  
	  return issueDetailss;
	 }
	 
	 @RequestMapping(value="/add", method=RequestMethod.PUT)
	 public @ResponseBody IssueDetailsRFS add(@RequestBody IssueDetailsRFS issueDetails){
		 Date currentDate= new Date();
		 issueDetails.setCreatedTime(currentDate);
	  issueDetailsService.saveOrUpdate(issueDetails);
	  
	  return issueDetails;
	 }
	 
	
	 
	 
	 @RequestMapping(value="/update/{id}", method=RequestMethod.PUT)
	 public @ResponseBody IssueDetailsRFS update(@PathVariable("id") int id, @RequestBody IssueDetailsRFS issueDetails){
		 issueDetails.setIssueReportedId(id);
	  issueDetailsService.saveOrUpdate(issueDetails);
	  
	  return issueDetails;
	 }
	 
	 @RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	 public @ResponseBody IssueDetailsRFS delete(@PathVariable("id") int id){
		 IssueDetailsRFS issueDetails = issueDetailsService.findIssueDetailsById(id);
	  issueDetailsService.deleteIssueDetails(id);
	  
	  return issueDetails;
	 }
	
}
