package com.zachary.ds.linkedlist;

import com.zachary.ds.linkedlist.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.frontAdd(2);
		list.frontAdd(3);
		list.endAdd(1);
		
		list.remove(2);
		list.enumerate();
		
//		list.enumerate();
//		System.out.println();
//		
//		list.removeHead();
//		list.enumerate();
//		System.out.println();
//
//		list.removeTail();
//		list.enumerate();
//		System.out.println();
	}
	
}
