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

import com.rfs.model.ClientDetailsRFS;
import com.rfs.service.ClientDetailsRFSService;

@RestController
@RequestMapping("/RFS/clientDetails")
public class ClientDetailsControllerRFS {
	
	
	@Autowired
	 ClientDetailsRFSService clientDetailsService;

	 
	 @RequestMapping(value="/", method=RequestMethod.GET, headers="Accept=application/json")
	 public @ResponseBody List getListClientDetails(){
	  List clientDetailss = clientDetailsService.getListClientDetails();
	  
	  return clientDetailss;
	 }
	 
	 @RequestMapping(value="/add", method=RequestMethod.PUT)
	 public @ResponseBody ClientDetailsRFS add(@RequestBody ClientDetailsRFS clientDetails){
		 Date currentDate= new Date();
		 clientDetails.setCreationTime(currentDate);
		 clientDetails.setUpdatedTime(currentDate);
	  clientDetailsService.saveOrUpdate(clientDetails);
	  
	  return clientDetails;
	 }
	 
	
	 
	 
	 @RequestMapping(value="/update/{id}", method=RequestMethod.PUT)
	 public @ResponseBody ClientDetailsRFS update(@PathVariable("id") int id, @RequestBody ClientDetailsRFS clientDetails){
		 clientDetails.setClientId(id);
	  clientDetailsService.saveOrUpdate(clientDetails);
	  
	  return clientDetails;
	 }
	 
	 @RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	 public @ResponseBody ClientDetailsRFS delete(@PathVariable("id") int id){
		 ClientDetailsRFS clientDetails = clientDetailsService.findClientDetailsById(id);
	  clientDetailsService.deleteClientDetails(id);
	  
	  return clientDetails;
	 }
	
}
