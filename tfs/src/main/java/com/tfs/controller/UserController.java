package com.tfs.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tfs.model.User;
import com.tfs.service.UserService;

@RestController
@RequestMapping("/userControl")
public class UserController {

 @Autowired
 UserService userService; 

 
 @RequestMapping(value="/user/", method=RequestMethod.GET, headers="Accept=application/json")
 public @ResponseBody List getListUser(){
  List users = userService.getListUser();
  return users;
 } 
 
 @RequestMapping(value = "/hello", method = RequestMethod.GET)
 public String newRegistration(ModelMap model) {
     
     //return "redirect:/pages/index.html";
	 return "UserManagement";
 }
 
/* @RequestMapping(value = "/hello", method = RequestMethod.GET)
public String newRegistration() {
     
     //return "redirect:/pages/index.html";
	 return "redirect:/views/UserManagement.jsp"; 
 }*/
 
 
 @RequestMapping(value="/add/", method=RequestMethod.PUT)
 public @ResponseBody User add(@RequestBody User user){
	 System.out.println("Inside");
	 Date date = new Date();
	 user.setCreationTime(date);
  userService.saveOrUpdate(user);
  
  return user;
 }
 
 @RequestMapping(value="test", method=RequestMethod.GET)
 public @ResponseBody User test(){
  
	User user = new User();
  return user;
 }
 
 
/* @RequestMapping(value="/update/{id}", method=RequestMethod.PUT)
 public @ResponseBody User update(@PathVariable("id") int id, @RequestBody User user){
  user.setId(id);
  userService.saveOrUpdate(user);
  
  return user;
 }
 */
 @RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
 public @ResponseBody User delete(@PathVariable("id") int id){
  User user = userService.findUserById(id);
  userService.deleteUser(id);
  
  return user;
 }
 
}
