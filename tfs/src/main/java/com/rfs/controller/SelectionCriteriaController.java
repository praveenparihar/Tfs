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

import com.rfs.model.SelectionCriteria;
import com.rfs.service.SelectionCriteriaService;

@RestController
@RequestMapping("/RFS/selectionCriteria")
public class SelectionCriteriaController {
	
	
	@Autowired
	 SelectionCriteriaService SelectionCriteriaService;

	 
	 @RequestMapping(value="/", method=RequestMethod.GET, headers="Accept=application/json")
	 public @ResponseBody List getListSelectionCriteria(){
	  List SelectionCriterias = SelectionCriteriaService.getListSelectionCriteria();
	  
	  return SelectionCriterias;
	 }
	 
	 @RequestMapping(value="/add", method=RequestMethod.PUT)
	 public @ResponseBody SelectionCriteria add(@RequestBody SelectionCriteria SelectionCriteria){
		 Date currentDate= new Date();
		 SelectionCriteria.setCreationTime(currentDate);
	  SelectionCriteriaService.saveOrUpdate(SelectionCriteria);
	  
	  return SelectionCriteria;
	 }
	 
	
	 
	 
	 @RequestMapping(value="/update/{id}", method=RequestMethod.PUT)
	 public @ResponseBody SelectionCriteria update(@PathVariable("id") int id, @RequestBody SelectionCriteria SelectionCriteria){
		 SelectionCriteria.setSelectionCriteriaId(id);
	  SelectionCriteriaService.saveOrUpdate(SelectionCriteria);
	  
	  return SelectionCriteria;
	 }
	 
	 @RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	 public @ResponseBody SelectionCriteria delete(@PathVariable("id") int id){
		 SelectionCriteria SelectionCriteria = SelectionCriteriaService.findSelectionCriteriaById(id);
	  SelectionCriteriaService.deleteSelectionCriteria(id);
	  
	  return SelectionCriteria;
	 }
	
}
