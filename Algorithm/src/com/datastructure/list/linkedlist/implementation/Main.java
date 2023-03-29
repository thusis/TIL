package com.datastructure.list.linkedlist.implementation;

public class Main {

	public static void main(String[] args) {
		
		LinkedList numbers = new LinkedList();
		
//		numbers.addFirst(30);
//		numbers.addFirst(20);
//		numbers.addFirst(10);
		
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		
//		System.out.println(numbers.node(0));
		
//		numbers.add(1,15);
		
		System.out.println(numbers);
		System.out.println(numbers.removeFirst());
		System.out.println(numbers.removeLast());
		System.out.println(numbers.remove(2));
		
		System.out.println(numbers.size());
		System.out.println(numbers.get(1));
		System.out.println(numbers.indexOf(29));
		LinkedList.ListIterator i = numbers.listIterator();
		System.out.println(i.next());
	}

}
