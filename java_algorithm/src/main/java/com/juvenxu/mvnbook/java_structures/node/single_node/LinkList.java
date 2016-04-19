package com.juvenxu.mvnbook.java_structures.node.single_node;


/*
 * 单链表操作
 * author:Yufeng Fan 1102194283@qq.com
 * ‎2016‎年‎4‎月‎19日 上午11：23：47
*/
public class LinkList {
	public SingleNode first;
	private int pos=0;
	public LinkList(){
		this.first=null;
	}
	/*插入头结点*/
	public void addFirstNode(int data){
		SingleNode node=new SingleNode(data);
		node.next=first;
		first =node;
	}
	/*删除头结点*/
	public SingleNode deleteFirstNode(){
		SingleNode tempNode=first;
		first=tempNode.next;
		return tempNode;
	}
	
	/*在指定位置插入节点*/
	public void add(int index,int data){
		SingleNode node =new SingleNode(data);
		SingleNode current =first;
		SingleNode previous=first;
		while(pos!=index){
			previous=current;
			current=current.next;
			pos++;
		}
		node.next=current;
		previous.next=node;
		pos=0;
	}
	/*在指定位置删除节点*/
	public SingleNode deleteByPos(int index){
		SingleNode current = first;
		SingleNode previous= first;
		while(pos!=index){
			pos++;
			previous=current;
			current=current.next;
		}
		if(current ==first){
			first=first.next;
		}else{
			pos=0;
			previous.next=current.next;
		}
		return current;
	}
	/*显示所有节点*/
	public void displayAllNodes(){
		SingleNode current=first;
		while(current!=null){
			current.display();
			current=current.next;
		}
		System.out.println();
	}
	/*查找节点*/
	public SingleNode findByPos(int index){
		SingleNode current =first;
		if(pos!=index){
			current =current.next;
			pos++;
		}
		return current;
		
	}
	/*查找数据节点*/
	public SingleNode findByData(int data){
		SingleNode current =first;
		while(current.data!=data){
			if(current.next!=null)
				return null;
			current=current.next;
		}
		return current;
	}

}
