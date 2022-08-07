package com.day14linkedlist.bridglabz;

public class Main2 {
	 public static void main(String[] args) {
    	 LinkedList2<Integer> list = new LinkedList2<>();
    	 list.addFirst(null);
         list.display();
         list.addFirst(70);
    	 System.out.println("Node with data 70 is First Created");
         list.display();
          System.out.println("Next 30 is added to 70");
         list.addFirst(30);
         list.display();
         System.out.println("Next 56 is added to 70");
         list.addFirst(56);
         list.display();

         
	 }
}