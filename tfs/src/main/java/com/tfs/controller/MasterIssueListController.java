package com.tfs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tfs.model.MasterIssueList;
import com.tfs.service.MasterIssueListService;

@RestController
@RequestMapping("/masterIssueList")
public class MasterIssueListController {
	
	
	@Autowired
	 MasterIssueListService masterIssueListService;

	 
	 @RequestMapping(value="/", method=RequestMethod.GET, headers="Accept=application/json")
	 public @ResponseBody List getListMasterIssueList(){
	  List masterIssueLists = masterIssueListService.getListMasterIssueList();
	  
	  return masterIssueLists;
	 }
	 
	 @RequestMapping(value="/add", method=RequestMethod.PUT)
	 public @ResponseBody MasterIssueList add(@RequestBody MasterIssueList masterIssueList){
	  masterIssueListService.saveOrUpdate(masterIssueList);
	  
	  return masterIssueList;
	 }
	 
	
	 
	 
	 @RequestMapping(value="/update/{id}", method=RequestMethod.PUT)
	 public @ResponseBody MasterIssueList update(@PathVariable("id") int id, @RequestBody MasterIssueList masterIssueList){
	  masterIssueListService.saveOrUpdate(masterIssueList);
	  
	  return masterIssueList;
	 }
	 
	 @RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	 public @ResponseBody MasterIssueList delete(@PathVariable("id") int id){
		 MasterIssueList masterIssueList = masterIssueListService.findMasterIssueListById(id);
	  masterIssueListService.deleteMasterIssueList(id);
	  
	  return masterIssueList;
	 }
	
}
