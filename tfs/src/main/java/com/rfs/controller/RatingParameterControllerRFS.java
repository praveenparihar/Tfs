package com.rfs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rfs.model.RatingParameterRFS;
import com.rfs.service.RatingParameterRFSService;

@RestController
@RequestMapping("/RFS/ratingParameter")
public class RatingParameterControllerRFS {
	
	
	@Autowired
	 RatingParameterRFSService ratingParameterService;

	 
	 @RequestMapping(value="/", method=RequestMethod.GET, headers="Accept=application/json")
	 public @ResponseBody List getListRatingParameter(){
	  List ratingParameters = ratingParameterService.getListRatingParameter();
	  
	  return ratingParameters;
	 }
	 
	 @RequestMapping(value="/add", method=RequestMethod.PUT)
	 public @ResponseBody RatingParameterRFS add(@RequestBody RatingParameterRFS ratingParameter){
	  ratingParameterService.saveOrUpdate(ratingParameter);
	  
	  return ratingParameter;
	 }
	 
	
	 
	 
	 @RequestMapping(value="/update/{id}", method=RequestMethod.PUT)
	 public @ResponseBody RatingParameterRFS update(@PathVariable("id") int id, @RequestBody RatingParameterRFS ratingParameter){
		 ratingParameter.setRatingParameterId(id);
	  ratingParameterService.saveOrUpdate(ratingParameter);
	  
	  return ratingParameter;
	 }
	 
	 @RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	 public @ResponseBody RatingParameterRFS delete(@PathVariable("id") int id){
		 RatingParameterRFS ratingParameter = ratingParameterService.findRatingParameterById(id);
	  ratingParameterService.deleteRatingParameter(id);
	  
	  return ratingParameter;
	 }
	
}
