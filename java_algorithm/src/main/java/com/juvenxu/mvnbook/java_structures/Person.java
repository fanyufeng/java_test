package com.juvenxu.mvnbook.java_structures;

public class Person {
	
	public String name;
	public int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void info(){
		System.out.println("come on!");
		System.out.println("name:"+getName()+"age:"+getAge());
		
	}
	

}
