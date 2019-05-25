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

import com.rfs.model.FeedBackDetailsRFS;
import com.rfs.service.FeedBackDetailsRFSService;

@RestController
@RequestMapping("/RFS/feedBackDetails")
public class FeedBackDetailsControllerRFS {
	
	
	@Autowired
	 FeedBackDetailsRFSService feedBackDetailsService;

	 
	 @RequestMapping(value="/", method=RequestMethod.GET, headers="Accept=application/json")
	 public @ResponseBody List getListFeedBackDetails(){
	  List feedBackDetailss = feedBackDetailsService.getListFeedBackDetails();
	  
	  return feedBackDetailss;
	 }
	 
	 @RequestMapping(value="/add", method=RequestMethod.PUT)
	 public @ResponseBody FeedBackDetailsRFS add(@RequestBody FeedBackDetailsRFS feedBackDetails){
		 Date currentDate= new Date();
		 feedBackDetails.setCreatedTime(currentDate);
	  feedBackDetailsService.saveOrUpdate(feedBackDetails);
	  
	  return feedBackDetails;
	 }
	 
	
	 
	 
	 @RequestMapping(value="/update/{id}", method=RequestMethod.PUT)
	 public @ResponseBody FeedBackDetailsRFS update(@PathVariable("id") int id, @RequestBody FeedBackDetailsRFS feedBackDetails){
		 feedBackDetails.setFeedBackId(id);
	  feedBackDetailsService.saveOrUpdate(feedBackDetails);
	  
	  return feedBackDetails;
	 }
	 
	 @RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	 public @ResponseBody FeedBackDetailsRFS delete(@PathVariable("id") int id){
		 FeedBackDetailsRFS feedBackDetails = feedBackDetailsService.findFeedBackDetailsById(id);
	  feedBackDetailsService.deleteFeedBackDetails(id);
	  
	  return feedBackDetails;
	 }
	
}
