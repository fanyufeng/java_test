package com.juvenxu.mvnbook.java_structures.node.single_node;

/*
 * 单链表结构
 * author:Yufeng Fan 1102194283@qq.com
 * ‎2016‎年‎4‎月‎19日 上午11：23：47
*/
public class SingleNode {
	 public SingleNode next;
	 public int data;
	 public SingleNode(int data){
		 this.data=data;
	 }
	 public void display(){
		 System.out.println("the node of singlenode is"+data);
	 }
}



