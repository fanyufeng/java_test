package com.juvenxu.mvnbook.java_structures.node.single_node;

public class TestLinkList {
	public static void main(String[] args){
		LinkList linkList=new LinkList();
		linkList.addFirstNode(20);
		linkList.addFirstNode(45);
		linkList.addFirstNode(67);
		
		linkList.add(1, 34);
		
		linkList.displayAllNodes();
		
	}
}
