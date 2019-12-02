package com.zachary.ds.doublylinkedlist;

import com.zachary.ds.doublylinkedlist.DoublyLinkedList;
import com.zachary.ds.doublylinkedlist.DoublyLinkedListNode;

public class DoublyLinkedListDemo {

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		
		list.frontAdd(new DoublyLinkedListNode(1));
		list.frontAdd(new DoublyLinkedListNode(2));
		list.enumerate();
	}
}
