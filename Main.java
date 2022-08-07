package com.day14linkedlist.bridglabz;

public class Main9 {
	
		public static void main(String args[]) {

			LinkedList9<Integer> list = new LinkedList9<>();

			System.out.println("Added 70 to LinkedList");
			list.addFirst(70);
			list.display();
			
			System.out.println("\nAdding 40 to LinkedList");
			list.addFirst(40);
			list.display();
			
			System.out.println("\nAdding 30 to LinkedList");
			list.addFirst(30);
			list.display();
			
			System.out.println("\nAdding 56 to LinkedList");
			list.addFirst(56);
			list.display();
			
			System.out.println("\nSearch for node 40");
			list.searchNode(40);
			System.out.println("\nDeleted node 40");
			list.deleteNode(40);
			list.display();

			System.out.println("\n");
			list.size_of_list();
			
		}
}
