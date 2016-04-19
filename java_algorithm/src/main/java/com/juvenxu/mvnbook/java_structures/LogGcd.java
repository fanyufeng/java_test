package com.juvenxu.mvnbook.java_structures;


/*
 * 欧几里德算法
 * author:Yufeng Fan 1102194283@qq.com
 * ‎2016‎年‎4‎月‎18‎日 下午2：59：47
*/
public class LogGcd {
	public long result;
	public long m,n;
	public LogGcd(){
		
	}
	public LogGcd(long x,long y){
		this.m=x;
		this.n=y;
	}
	public  void logGcdResultSecond(){
		while(n!=0){
			long rem=m%n;
			m=n;
			n=rem;
		}
		result=m;
	}
	public  void logGcdResult(long x,long y){
		while(y!=0){
			long rem=x%y;
			x=y;
			y=rem;
		}
		result=x;
	}
	
}
