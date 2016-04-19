package com.juvenxu.mvnbook.service;

import com.juvenxu.mvnbook.dao.UserInfo;


public interface UserDao {
	public void add(UserInfo user);
	public boolean login(UserInfo user);
	public UserInfo getUser(int id);
}
