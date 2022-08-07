package com.day14linkedlist.bridglabz;

public class LinkedList4<T> {
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

	public void insertAfter(Node prev_node, int new_data) {
		if (prev_node == null) {
			System.out.println("The given previous node cannot be null");
			return;
		}
		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;

		prev_node.next = new_node;
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
