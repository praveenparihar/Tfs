package com.tfs.service;

import java.util.List;

import com.tfs.model.User;

public interface UserService {
 
 public List getListUser();
 
 public void saveOrUpdate(User user);
 
 public void deleteUser(int id);
 
 public User findUserById(int id);
 
}