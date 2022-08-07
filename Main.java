package com.day14linkedlist.bridglabz;

public class Main3 {
	public static void main(String args[]) {
	 LinkedList3<Integer> list = new LinkedList3<>();
     list.display();
     list.addFirst(56);
	 System.out.println("Node with data 56 is First Created");
     list.display();
      System.out.println("Next 30 is added to 70");
     list.addLast(30);
     list.display();
     System.out.println("Next 56 is added to 70");
     list.addLast(70);
     list.display();
}
}
