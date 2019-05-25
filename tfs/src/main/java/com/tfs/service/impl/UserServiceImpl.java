package com.tfs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tfs.dao.UserDao;
import com.tfs.model.User;
import com.tfs.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {
 
 UserDao userDao;
 
 @Autowired
 public void setUserDao(UserDao userDao) {
  this.userDao = userDao;
 }

 public List getListUser() {
  return userDao.getListUser();
 }

 public void saveOrUpdate(User user) {
  userDao.saveOrUpdate(user);
 }

 public void deleteUser(int id) {
  userDao.deleteUser(id);
 }

 public User findUserById(int id) {
  return userDao.findUserById(id);
 }

}