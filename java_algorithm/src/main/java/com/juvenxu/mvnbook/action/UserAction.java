package com.juvenxu.mvnbook.action;

import com.juvenxu.mvnbook.dao.UserInfo;
import com.juvenxu.mvnbook.service.UserDao;

import java.util.Map;

public class UserAction {
	private UserInfo user;
	private UserDao userDao;
	
	public UserInfo getUser(){
		return user;
	}
	public void setUser(UserInfo user){
		this.user=user;
	}
	public UserDao getUserDao(){
		return userDao;
	}
	public void setUserDao(UserDao userDao){
		this.userDao=userDao;
	}
	public String login(){
		if(userDao.login(user)){
			
			return "success";
		}
		else{
			return "error";
		}
	}
	public String add(){
		userDao.add(user);
		return "login";
	}
	

}
