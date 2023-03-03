package com.datastructure.stack;

public class ArrayStack {
	
	int top; // 인덱스
	int size; //스택 배열의 크기
	int[] stack;
	
	public ArrayStack(int size) {
		this.size = size;
		stack = new int[size];
		top = -1 ;
	}
	
	public void push(int item) {
		stack[++top] = item;
		System.out.println(stack[top]+" Push!");
	}
	
	public void pop() {
		System.out.println(stack[top]+" Pop!");
		int pop = stack[top];
		stack[top--] = 0;
	}
	
	public void peek() {
		System.out.println(stack[top]+" Peek!");
	}
	
	/**
	 * [배열로 스택 만들기]
	 * https://go-coding.tistory.com/5
	 * 1
	 * 배열의 장점은 구현이 빠르고 데이터의 접근속도가 빨라 조회가 빠르다는 점 입니다. 
	 * 하지만 배열의 크기가 정해져있어야만 사용할 수 있습니다. 
	 * 실제 프로젝트에서 사용하기에는 좋지 않습니다
	 * (Stack클래스를 사용할때 어느 곳에서도 사이즈를 지정해 주지 않았습니다.)
	 * 2
	 * 배열을 초기화 해줄때 int [] stack = new int [5]을 하게되면 
	 * 배열의 크기는 5가 되고 값은 null 초기화 됩니다. 
	 * 배열의 값들을 제거할때는 배열의 데이터 형태가 int형태이므로 
	 * null이 아닌 0값을 임의로 넣어줬습니다
	 */

}
