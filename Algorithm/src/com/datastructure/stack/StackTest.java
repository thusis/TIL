package com.datastructure.stack;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		
		int size = 10;
		
		usingStackClass();
		ArrayStack as = makeStackUsingArray(size);
		Node node = makeStackUsingLinkedSet();
	}

	private static Node makeStackUsingLinkedSet() {
		
		
		return null;
	}

	private static ArrayStack makeStackUsingArray(int size) {
		return new ArrayStack(size);
	}

	private static void usingStackClass() {
//		Stack<Element> stack = new Stack<>(); // 기본형
		Stack<Integer> stack = new Stack<>();//push, pop, peek, empty, search 지원
		for(int i=1; i<=5; i++) {
			stack.push(i);
			System.out.println("push("+i+")이후 stack.peek() : " +stack.peek()); //가장 위에 있는 것을 출력
			System.out.println("stack.size() : "+stack.size());
			System.out.println("stack.capacity() : "+stack.capacity()+"\n");//Internally Stack uses Vector and Vector is a dynamic growing array
		}
		System.out.println();
		for(int i=0; i<stack.size(); i++) {
			stack.pop();
			System.out.println(i+"번째 stack.pop() 이후 peek:" + stack.peek());
			System.out.println("stack.size() : "+stack.size());
			System.out.println("stack.search(3): "+stack.search(3)); // 맨 밑부터 인덱스를 출력
			System.out.println("stack.empty(): "+stack.empty()+"\n"); //현재 스택이 비었으면 True, 값이 들어가 있으면 False
		}
	}
}
