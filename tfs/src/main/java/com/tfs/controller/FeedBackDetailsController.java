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

import com.tfs.model.FeedBackDetails;
import com.tfs.service.FeedBackDetailsService;

@RestController
@RequestMapping("/feedBackDetails")
public class FeedBackDetailsController {
	
	
	@Autowired
	 FeedBackDetailsService feedBackDetailsService;

	 
	 @RequestMapping(value="/", method=RequestMethod.GET, headers="Accept=application/json")
	 public @ResponseBody List getListFeedBackDetails(){
	  List feedBackDetailss = feedBackDetailsService.getListFeedBackDetails();
	  
	  return feedBackDetailss;
	 }
	 
	 @RequestMapping(value="/add", method=RequestMethod.POST)
	 public @ResponseBody FeedBackDetails add(@RequestBody FeedBackDetails feedBackDetails){
		 Date currentDate= new Date();
		 feedBackDetails.setCreatedTime(currentDate);
	  feedBackDetailsService.saveOrUpdate(feedBackDetails);
	  
	  return feedBackDetails;
	 }
	 
	
	 
	 
	 @RequestMapping(value="/update/{id}", method=RequestMethod.PUT)
	 public @ResponseBody FeedBackDetails update(@PathVariable("id") int id, @RequestBody FeedBackDetails feedBackDetails){
		 feedBackDetails.setFeedBackId(id);
	  feedBackDetailsService.saveOrUpdate(feedBackDetails);
	  
	  return feedBackDetails;
	 }
	 
	 @RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	 public @ResponseBody FeedBackDetails delete(@PathVariable("id") int id){
		 FeedBackDetails feedBackDetails = feedBackDetailsService.findFeedBackDetailsById(id);
	  feedBackDetailsService.deleteFeedBackDetails(id);
	  
	  return feedBackDetails;
	 }
	
}
