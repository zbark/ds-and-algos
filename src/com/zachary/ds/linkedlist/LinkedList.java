package com.zachary.ds.linkedlist;

public class LinkedList {

	private LinkedListNode head;
	private LinkedListNode tail;
	private int count = 0;

	public void frontAdd(LinkedListNode linkedListNode) {
		
		//set aside head
		LinkedListNode temp = head;
		//make head new node
		head = linkedListNode;
		//set head next to old head
		head.setNext(temp);

		count += 1;

		//if only one node, also set tail
		if (count == 1) {
			tail = head;
		}
	}

	public void endAdd(LinkedListNode linkedListNode) {

		//if no nodes, also set head
		if (count == 0) {
			head = linkedListNode;
		} 
		//set tail next to new node
		else {
			tail.setNext(linkedListNode);
		}
		//set tail to new node
		tail = linkedListNode;
		count += 1;
	}
	
	public void removeHead() {
		if(count == 1) {
			head = null;
			tail = null;
			count -= 1;
		} 
		//set head to next node in line
		else if(count != 0) {
			head = head.getNext();
			count -= 1;
		}
	}
	
	public void removeTail() {
		if(count == 1) {
			head = null;
			tail = null;
			count -= 1;
		} else if(count != 0) {
			//iterate until you are at next-to-last node
			LinkedListNode current = head;
			while(current.getNext() != tail) {
				current = current.getNext();
			}
			//set tail and remove reference to old tail
			tail = current;
			tail.setNext(null);
		}
	}
	
	/**
	 * Additional functionality methods --------------------------------------------------------------- 
	 */
	
	public void frontAdd(int value) {
		//creates node from given value
		LinkedListNode linkedListNode = new LinkedListNode(value);
		LinkedListNode temp = head;
		head = linkedListNode;
		head.setNext(temp);

		count += 1;

		if (count == 1) {
			tail = head;
		}
	}
	
	
	public void endAdd(int value) {
		//creates node from given value
		LinkedListNode linkedListNode = new LinkedListNode(value);
		if (count == 0) {
			head = linkedListNode;
		} 
		else {
			tail.setNext(linkedListNode);
		}
		tail = linkedListNode;
		count += 1;
	}
	
	public void enumerate() {
		LinkedListNode current = head;
		while(current != null) {
			System.out.println(current.getValue());
			current = current.getNext();
		}
	}
	
	public int size() {
		int size = 0;
		LinkedListNode current = head;
		while(current != null) {
			current = current.getNext();
			size += 1;
		}
		return size;
	}

	public boolean contains(int value) {
		LinkedListNode current = head;
		while(current != null) {
			if(current.getValue()==value) {
				return true;
			}
			current = current.getNext();
		}
		return false;
	}
	
	public void remove(int value) {
		/**
		 * 1. empty list
		 * 2. single node
		 * 3. many nodes
		 * 	a. first node (no previous)
		 * 	b. middle or last
		 */
		LinkedListNode current = null;
		LinkedListNode previous = null;
		
		current = head;
		
		if(head == null) {
			return;
		} else if (head == tail) {
			head = null;
			tail = null;
			count -= 1;
		} else if (head.getValue() == value){
			removeHead();
		} else {
			previous = current;
			current = current.getNext();
			while(current!=null) {			
				if(current.getValue()==value) {
					previous.setNext(current.getNext());
					count -= 1;
					return;
				}
				previous = current;
				current = current.getNext();
			}
		}
	}

	public LinkedListNode getHead() {
		return head;
	}

	public LinkedListNode getTail() {
		return tail;
	}

}
