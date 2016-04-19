package com.juvenxu.mvnbook.dao;

import java.io.Serializable;
public class UserInfo implements Serializable{
	private Integer UId;
	private String UName;
	private String UPassword;
	
	public UserInfo(){
		
	}
	public UserInfo(Integer UId){
		this.UId=UId;
	}
	public UserInfo(Integer UId,String UName,String UPassword){
		this.UId=UId;
		this.UName=UName;
		this.UPassword=UPassword;
		
	}
	public Integer getUId() {
		return UId;
	}
	public void setUId(Integer uId) {
		UId = uId;
	}
	public String getUName() {
		return UName;
	}
	public void setUName(String uName) {
		UName = uName;
	}
	public String getUPassword() {
		return UPassword;
	}
	public void setUPassword(String uPassword) {
		UPassword = uPassword;
	}
	
	
}
