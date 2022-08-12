package com.day14linkedlist.bridglabz;

public class SortedLinkedList<K extends Comparable<K>>{
	
	INode<K> head;
	INode<K> tail;
	int positionOfLastNode;
	
	public SortedLinkedList() {
		head = null;
		tail = null;
		positionOfLastNode = -1;
	}
	
	
	public void add(INode<K> newNode) {
		K newNodeKey = newNode.getKey();
		if(head == null) {
			head = newNode;
			tail = head;
		}
		else if(head.getKey().compareTo(newNodeKey)>0) {
			newNode.setNext(head);
			head = newNode;
		}
		else if(tail.getKey().compareTo(newNodeKey)<0) {
			tail.setNext(newNode);
			tail = newNode;
		}
		else {
			INode<K> temporaryPrevious = head;
			INode<K> temporaryCurrent = head.getNext();
			
			while((temporaryCurrent != tail) && (temporaryCurrent.getKey().compareTo(newNodeKey)<0)) {
				temporaryPrevious = temporaryCurrent;
				temporaryCurrent = temporaryCurrent.getNext();
			}
			temporaryPrevious.setNext(newNode);
			newNode.setNext(temporaryCurrent);
			
		}
		positionOfLastNode++;
	}
	
	
	public void remove(K key) {
		INode<K> temporaryCurrent = head;
		INode<K> tempPrevious = null;
		while(!temporaryCurrent.getKey().equals(key)) {
			tempPrevious = temporaryCurrent;
			temporaryCurrent = temporaryCurrent.getNext();
		}
		if(temporaryCurrent == head) {
			head = head.getNext();
		}
		else {
			tempPrevious.setNext(temporaryCurrent.getNext());
		}
		
		if(temporaryCurrent == tail) {
			tail = tempPrevious;
		}
		positionOfLastNode--;
	}
	
	
	public int index(K key) {
		if(positionOfLastNode == -1) {
			return -1;
		}
		INode<K> temporaryNode = head;
		int temporaryPosition = 0;
		while(!temporaryNode.getKey().equals(key)) {
			if(temporaryNode == tail) {
				return -1;
			}
			temporaryNode = temporaryNode.getNext();
			temporaryPosition++;
		}
		return temporaryPosition;
	}
	
	
	public boolean search(K key) {
		return index(key) == -1?false:true;
	}
	
	
	public boolean isEmpty() {
		return positionOfLastNode==-1?true:false;
	}
	
	
	public int size() {
		return positionOfLastNode+1;
	}
	
	
	public K pop(int position) {
		INode<K> temporaryCurrent = head;
		INode<K> temporaryPrevious = null;
		int temporaryPosition = 0;
		positionOfLastNode--;
		
		while(temporaryPosition != position) {
			temporaryPrevious = temporaryCurrent;
			temporaryCurrent = temporaryCurrent.getNext();
			temporaryPosition++;
		}
		
		if(temporaryCurrent == head) {
			head = head.getNext();
			return temporaryCurrent.getKey();
		}
		else if(temporaryCurrent == tail) {
			tail = temporaryPrevious;
			temporaryPrevious.setNext(temporaryCurrent.getNext());
			return temporaryCurrent.getKey();
		}
		else {
			temporaryPrevious.setNext(temporaryCurrent.getNext());
			return temporaryCurrent.getKey();
		}
	}
	
	
	public K pop() {
		return pop(positionOfLastNode);
	}
	
	
	public void printSortedLinkedList() {
		System.out.println("My Nodes: " + head);
	}
	
	public static void main(String[] args) {
		
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		MyNode<Integer> test = new MyNode<Integer>(66);
		
		SortedLinkedList mySortedLinkedList = new SortedLinkedList();
		mySortedLinkedList.add(firstNode);
		mySortedLinkedList.add(secondNode);
		mySortedLinkedList.add(thirdNode);
		mySortedLinkedList.add(test);
		System.out.println("Original Sorted Linked List");
		mySortedLinkedList.printSortedLinkedList();
		
		mySortedLinkedList.remove(66);
		System.out.println("Linked List after removing 66");
		mySortedLinkedList.printSortedLinkedList();
		
		System.out.println("The size of the List is: "+mySortedLinkedList.size());
		System.out.println("The key 56 is at index : "+mySortedLinkedList.index(56));
		System.out.println("Is the list empty? "+mySortedLinkedList.isEmpty());
		System.out.println("Is 71 in the linked list? "+mySortedLinkedList.search(71));
		System.out.println("Popping the last element");
		mySortedLinkedList.pop();
		mySortedLinkedList.printSortedLinkedList();
	}

}
