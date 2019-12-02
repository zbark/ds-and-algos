package com.zachary.ds.doublylinkedlist;

public class DoublyLinkedListNode {
	private int data;
	private DoublyLinkedListNode previous;
	private DoublyLinkedListNode next;

	public DoublyLinkedListNode(int data) {
		super();
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public DoublyLinkedListNode getPrevious() {
		return previous;
	}

	public void setPrevious(DoublyLinkedListNode previous) {
		this.previous = previous;
	}

	public DoublyLinkedListNode getNext() {
		return next;
	}

	public void setNext(DoublyLinkedListNode next) {
		this.next = next;
	}

}
