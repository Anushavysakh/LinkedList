package com.day14linkedlist.bridglabz;

public class LinkedList2<T> {
	public Node<T> head = null;
	public Node<T> tail = null;

	public void addFirst(T data) {
		if (isEmpty()) {

			head = new Node(data);
			tail = head;
			return;
		}
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	public boolean isEmpty() {
		return head == null;
	}

	
	void display() {
		Node<T> current = head;

		while (current != null) {
			System.out.print(current.data+"->"  );
			current = current.next;
		}
		System.out.println("null");
	}

}
