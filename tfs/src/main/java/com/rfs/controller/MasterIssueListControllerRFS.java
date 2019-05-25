package com.rfs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rfs.model.MasterIssueListRFS;
import com.rfs.service.MasterIssueListRFSService;

@RestController
@RequestMapping("/RFS/masterIssueList")
public class MasterIssueListControllerRFS {
	
	
	@Autowired
	 MasterIssueListRFSService masterIssueListService;

	 
	 @RequestMapping(value="/", method=RequestMethod.GET, headers="Accept=application/json")
	 public @ResponseBody List getListMasterIssueList(){
	  List masterIssueLists = masterIssueListService.getListMasterIssueList();
	  
	  return masterIssueLists;
	 }
	 
	 @RequestMapping(value="/add", method=RequestMethod.PUT)
	 public @ResponseBody MasterIssueListRFS add(@RequestBody MasterIssueListRFS masterIssueList){
	  masterIssueListService.saveOrUpdate(masterIssueList);
	  
	  return masterIssueList;
	 }
	 
	
	 
	 
	 @RequestMapping(value="/update/{id}", method=RequestMethod.PUT)
	 public @ResponseBody MasterIssueListRFS update(@PathVariable("id") int id, @RequestBody MasterIssueListRFS masterIssueList){
	  masterIssueListService.saveOrUpdate(masterIssueList);
	  
	  return masterIssueList;
	 }
	 
	 @RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	 public @ResponseBody MasterIssueListRFS delete(@PathVariable("id") int id){
		 MasterIssueListRFS masterIssueList = masterIssueListService.findMasterIssueListById(id);
	  masterIssueListService.deleteMasterIssueList(id);
	  
	  return masterIssueList;
	 }
	
}
