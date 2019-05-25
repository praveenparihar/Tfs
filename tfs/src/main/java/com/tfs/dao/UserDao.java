package com.tfs.dao;

import java.util.List;

import com.tfs.model.User;

public interface UserDao {
 
 public List getListUser();
 
 public void saveOrUpdate(User user);
 
 public void deleteUser(int id);
 
 public User findUserById(int id);
 
}