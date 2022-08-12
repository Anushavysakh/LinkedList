package com.day14linkedlist.bridglabz;

public class Main10 {

	public static void main(String[] args) {
		
		System.out.println("----- Welcome to Data Structure: Linked List -----");
		
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		MyNode<Integer> nodeToBeInserted = new MyNode<Integer>(40);
		int valueOfPreviousNode = 70;
		LinkedList10 myLinkedList = new LinkedList10();
		myLinkedList.add(firstNode);
		myLinkedList.append(thirdNode);
		myLinkedList.insert(firstNode, secondNode);
		myLinkedList.insertWithKey(valueOfPreviousNode, nodeToBeInserted);
		INode deletedNode = myLinkedList.deleteNodeWithKey(40);
		System.out.println("The deleted key value is:"+deletedNode.getKey());
		myLinkedList.printLinkedList();
	}

}
