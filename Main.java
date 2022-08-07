package com.day14linkedlist.bridglabz;

public class Main4 {
	public static void main(String args[]) {
		 LinkedList4<Integer> list = new LinkedList4<>();
	     list.display();
	     list.addFirst(70);
		 System.out.println("Added 56 ");
		 list.addFirst(56);
		 System.out.println("Added 70");
		 list.display();
		 System.out.println("Adding 30 between 70 and 56");
		 list.insertAfter(list.head,30);
		 list.display();
}
}
