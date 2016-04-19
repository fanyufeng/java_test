package com.juvenxu.mvnbook.java_structures;

/*
 * 递归算法
 * f(x)=2f(x-1)+x*x
 * author:Yufeng Fan fyf820@163.com
 * ‎2016‎年‎4‎月‎18‎日
 * 
 * 
 * 	1、private修饰词，表示成员是私有的，只有自身可以访问；   
 *  2、protected，表示受保护权限，体现在继承，即子类可以访问父类受保护成员，同时相同包内的其他类也可以访问protected成员。   
 *  3、无修饰词（默认），表示包访问权限（friendly， java语言中是没有friendly这个修饰符的，这样称呼应该是来源于c++ ），同一个包内可以访问，访问权限是包级访问权限；  
 *  4、public修饰词，表示成员是公开的，所有其他类都可以访问；
 *  5.被static修饰的成员变量和成员方法独立于该类的任何对象。也就是说，它不依赖类特定的实例，被类的所有实例共享
*/



public class Recursion {
	public int Result ;
	public Recursion(){
	}
	public  Recursion(int x){
		this.Result=x;
	}
	public static int recursionExample(int y){
		if(y==0){
			return 0;
		}else{
			return 2*recursionExample(y-1)+y*y;
		}
	}

}
