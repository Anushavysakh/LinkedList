package com.day14linkedlist.bridglabz;

public class LinkedList8<T> {
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

		while (current.next.next != null) {
			current = current.next;
		}

		current.next = null;

		// System.out.println(current);
	}

	public void searchNode(T data) {
		Node current = head;
		int i = 1;
		boolean flag = false;
		// Checks whether list is empty
		if (head == null) {
			System.out.println("List is empty");
		} else {
			while (current != null) {
				if (current.data == data) {
					flag = true;
					break;
				}
				i++;
				current = current.next;
			}
		}
		if (flag)
			System.out.println("Element is present in the list at the position : " + i);
		else
			System.out.println("Element is not present in the list");
	}

	public void insertAfter(Node prev_node, int new_data) {
		if (prev_node == null) {
			System.out.println("The given previous node cannot be null");
			return;
		}

		Node new_node = new Node(new_data);

		
		new_node.next = prev_node.next;

		/* 5. make next of prev_node as new_node */
		prev_node.next = new_node;
	}

}
