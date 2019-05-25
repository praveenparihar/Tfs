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

import com.tfs.model.ClientDetails;
import com.tfs.service.ClientDetailsService;

@RestController
@RequestMapping("/")
public class ClientDetailsController {
	
	
	@Autowired
	 ClientDetailsService clientDetailsService;

	 
	 @RequestMapping(value="/getListClientDetails/", method=RequestMethod.GET)
	 public @ResponseBody List getListClientDetails(){
		 System.out.println("Inside getListClientDetails");
	  List clientDetailss = clientDetailsService.getListClientDetails();
	  System.out.println("clientDetailss :: "+clientDetailss);
	  return clientDetailss;
	 }
	 
	 @RequestMapping(value="/add", method=RequestMethod.PUT)
	 public @ResponseBody ClientDetails add(@RequestBody ClientDetails clientDetails){
		 System.out.println("inside add client");
		 Date currentDate= new Date();
		 clientDetails.setCreationTime(currentDate);
		 clientDetails.setUpdatedTime(currentDate);
	  clientDetailsService.saveOrUpdate(clientDetails);
	  
	  return clientDetails;
	 }
	
	 
	 @RequestMapping(value="/update/{id}", method=RequestMethod.PUT)
	 public @ResponseBody ClientDetails update(@PathVariable("id") int id, @RequestBody ClientDetails clientDetails){
		 clientDetails.setClientId(id);
	  clientDetailsService.saveOrUpdate(clientDetails);
	  
	  return clientDetails;
	 }
	 
	 @RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	 public @ResponseBody ClientDetails delete(@PathVariable("id") int id){
		 ClientDetails clientDetails = clientDetailsService.findClientDetailsById(id);
	  clientDetailsService.deleteClientDetails(id);
	  
	  return clientDetails;
	 }
	
	 
}
