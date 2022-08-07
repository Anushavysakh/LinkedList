package com.day14linkedlist.bridglabz;

public class Main7 {

	public static void main(String args[]) {

		LinkedList7<Integer> list = new LinkedList7<>();

		System.out.println("Added 70 to LinkedList");
		list.addFirst(70);
		list.display();
		
		System.out.println("Adding 30 to LinkedList");
		list.addFirst(30);
		list.display();
		
		System.out.println("Adding 56 to LinkedList");
		list.addFirst(56);
		list.display();
		
		System.out.println("The last element 70  is removed:\t");
		list.pop();
		list.display();
		
		System.out.println("Added 68 to LinkedList");
		list.addFirst(68);
		list.display();
		
		System.out.println("Search for node 30");
		list.searchNode(30);
	}
}
