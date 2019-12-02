package com.zachary.ds.doublylinkedlist;

public class DoublyLinkedList {

	private DoublyLinkedListNode head;
	private DoublyLinkedListNode tail;
	private int count = 0;
	
	public void frontAdd(DoublyLinkedListNode doublyLinkedListNode) {
		//set aside head
		DoublyLinkedListNode temp = head;
		//set new head 
		head = doublyLinkedListNode;
		//set old head previous to new head
		head.setNext(temp);
		
		if(temp!=null) {
			temp.setPrevious(head);
		}
		
		count+=1;
		
		//if only one node, also set tail
		if (count == 1) {
			tail = head;
		}
	}
	
	public void enumerate() {
		DoublyLinkedListNode current = head;
		while(current != null) {
			System.out.println(current.getData());
			current = current.getNext();
		}
	}
}
