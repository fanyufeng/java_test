package com.juvenxu.mvnbook.service.impl;

import com.juvenxu.mvnbook.dao.UserInfo;
import com.juvenxu.mvnbook.service.UserDao;

public class UserDaoImpl implements UserDao{
	public void add(UserInfo user){
		
	}
	public boolean login(UserInfo user){
		return true;
	}
	public UserInfo getUser(int id){
		UserInfo a = new UserInfo(12);
		a.setUName("fgdh");
		a.setUPassword("hbsdf");
		
		if(id==12){
			return a;
		}
		else{
			return a;
		}
	}

}
