package com.day14linkedlist.bridglabz;

public class LinkedList<T> {
	public Node<T> head = null;
	public Node<T> tail = null;

	void add(T data) {
		Node<T> newNode = new Node<>(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {

			tail.next = newNode;
			tail = newNode;
		}
	}

	void display() {
		Node<T> current = head;

		while (current != null) {
			System.out.print(current.data + "->");
			current = current.next;
		}
		System.out.println("null");
	}

}
