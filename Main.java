package com.day14linkedlist.bridglabz;
import java.util.LinkedList;

public class Main5 {
	public static void main(String args[]) {
	 LinkedList5<Integer> list = new LinkedList5<>();
     list.display();
     list.addFirst(70);
	 System.out.println("Added 70 ");
	 list.addFirst(30);
	 System.out.println("Added 30");
	 list.display();
	 list.addFirst(56);
	 System.out.println("Added 56 ");
	 list.display();
	 
    System.out.println("The first element is removed:\t");

	 list.pop();
	 list.display();

	}
}