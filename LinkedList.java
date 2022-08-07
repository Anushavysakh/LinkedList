package com.day14linkedlist.bridglabz;

public class LinkedList6 <T>{
	public Node<T> head = null;
	public Node<T> tail = null;

	public void addFirst(T data) {
		if (isEmpty()) {

			head = new Node<T>(data);
			tail = head;
			return;
		}
		Node<T> newNode = new Node<T>(data);
		newNode.next = head;
		head = newNode;
	}

	public boolean isEmpty() {
		return head == null;
	}

	void display() {
		Node<T> current = head;

		while (current != null) {
			System.out.print(current.data + "--> ");
			current = current.next;
		}
		System.out.println("null");
	}
	
	public void pop() {
		 Node current = head;

	      while(current.next.next != null) {
	          current = current.next;
	      }

	      current.next = null;

	  //    System.out.println(current);
	}
}
