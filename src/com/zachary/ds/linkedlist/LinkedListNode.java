package com.zachary.ds.linkedlist;

public class LinkedListNode {

	private int value;
	private LinkedListNode next;

	public LinkedListNode(int value) {
		super();
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public LinkedListNode getNext() {
		return next;
	}

	public void setNext(LinkedListNode next) {
		this.next = next;
	}

}
