package com.day14linkedlist.bridglabz;

public class LinkedList5<T> {
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
			System.out.print(current.data + "->");
			current = current.next;
		}
		System.out.println("null");
	}
	//Deleting first element of linked list
	public T pop() {
		  T current = head.data;
	        head = head.next;
	        return current;
	}
}
