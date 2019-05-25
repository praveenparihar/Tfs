package com.tfs.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tfs.model.IssueDetails;
import com.tfs.service.IssueDetailsService;

@RestController
@RequestMapping("/issueDetails")
public class IssueDetailsController {
	
	
	@Autowired
	 IssueDetailsService issueDetailsService;

	 
	 @RequestMapping(value="/issueDetails", method=RequestMethod.GET, headers="Accept=application/json")
	 public @ResponseBody List getListIssueDetails(){
	  List issueDetailss = issueDetailsService.getListIssueDetails();
	  
	  return issueDetailss;
	 }
	 
	 @RequestMapping(value="/add", method=RequestMethod.PUT)
	 public @ResponseBody IssueDetails add(@RequestBody IssueDetails issueDetails){
		 Date currentDate= new Date();
		 issueDetails.setCreatedTime(currentDate);
	  issueDetailsService.saveOrUpdate(issueDetails);
	  
	  return issueDetails;
	 }
	 
	
	 
	 
	 @RequestMapping(value="/update/{id}", method=RequestMethod.PUT)
	 public @ResponseBody IssueDetails update(@PathVariable("id") int id, @RequestBody IssueDetails issueDetails){
		 issueDetails.setIssueReportedId(id);
	  issueDetailsService.saveOrUpdate(issueDetails);
	  
	  return issueDetails;
	 }
	 
	 @RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	 public @ResponseBody IssueDetails delete(@PathVariable("id") int id){
		 IssueDetails issueDetails = issueDetailsService.findIssueDetailsById(id);
	  issueDetailsService.deleteIssueDetails(id);
	  
	  return issueDetails;
	 }
	
}
