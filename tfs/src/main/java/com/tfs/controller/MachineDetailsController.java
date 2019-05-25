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

import com.tfs.model.MachineDetails;
import com.tfs.service.MachineDetailsService;

@RestController
@RequestMapping("/machineDetails")
public class MachineDetailsController {
	
	
	@Autowired
	 MachineDetailsService machineDetailsService;

	 
	 @RequestMapping(value="/", method=RequestMethod.GET, headers="Accept=application/json")
	 public @ResponseBody List getListMachineDetails(){
	  List machineDetailss = machineDetailsService.getListMachineDetails();
	  
	  return machineDetailss;
	 }
	 
	 @RequestMapping(value="/add", method=RequestMethod.PUT)
	 public @ResponseBody MachineDetails add(@RequestBody MachineDetails machineDetails){
		 Date currentDate= new Date();
		 machineDetails.setInstallTime(currentDate);
		 machineDetails.setRestartTime(currentDate);
	  machineDetailsService.saveOrUpdate(machineDetails);
	  
	  return machineDetails;
	 }
	 
	
	 
	 
	 @RequestMapping(value="/update/{id}", method=RequestMethod.PUT)
	 public @ResponseBody MachineDetails update(@PathVariable("id") int id, @RequestBody MachineDetails machineDetails){
		 machineDetails.setMachineId(id);
	  machineDetailsService.saveOrUpdate(machineDetails);
	  
	  return machineDetails;
	 }
	 
	 @RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	 public @ResponseBody MachineDetails delete(@PathVariable("id") int id){
		 MachineDetails machineDetails = machineDetailsService.findMachineDetailsById(id);
	  machineDetailsService.deleteMachineDetails(id);
	  
	  return machineDetails;
	 }
	
}
