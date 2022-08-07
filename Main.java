package com.day14linkedlist.bridglabz;

public class Main8 {

	public static void main(String[] args) {

		LinkedList8<Integer> list = new LinkedList8<>();

		System.out.println("Added 70 to LinkedList");
		list.addFirst(70);
		list.addFirst(30);
		list.addFirst(56);
		list.display();
		list.insertAfter(list.head.next, 40);	
		list.display();
		
	}

}
