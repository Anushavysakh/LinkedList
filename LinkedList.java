package com.day14linkedlist.bridglabz;

public class LinkedList9 <T> {

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
	public void deleteNode (T key)  {
        Node current = head, prev = null;
 
        if (current != null && current.data == key) {
            head = current.next; // Changed head
            return;
        }
 
        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }
 
        // If key was not present in linked list
        if (current == null)
            return;
 
        // Unlink the node from linked list
        prev.next = current.next;
    }
 
  
	void size_of_list() {
		int size = 0;

		if (head == null) {
			System.out.println("Size of List" + size);
			return;
		}

		Node current = head;
		size = 1;
		while (current.next != null) {
			current = current.next;
			size++;
		}
		System.out.println("Size of List" + size);
	}

}
