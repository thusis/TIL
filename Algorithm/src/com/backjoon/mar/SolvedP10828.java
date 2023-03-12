package com.backjoon.mar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class SolvedP10828 {
	//스택 https://www.acmicpc.net/problem/10828
	public static void main (String[] args) {
		/**
		 * 정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
		 * 	push X: 정수 X를 스택에 넣는 연산이다.
			pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 
				 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
			size: 스택에 들어있는 정수의 개수를 출력한다.
			empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
			top: 스택의 가장 위에 있는 정수를 출력한다. 
				만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		 *첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 
		 *둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 
		 *주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 
		 *문제에 나와있지 않은 명령이 주어지는 경우는 없다.
		 **/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine()); //명령의 수
			int i = 1;
			Stack<Integer> stack = new Stack<>();
			while(i<=n) {
				String input = br.readLine();
				switch(input.split(" ")[0]) {
				case "push": stack.push(Integer.parseInt(input.split(" ")[1])); break;
				case "pop":
					if(!stack.empty()) {
						System.out.println(stack.pop());
					}else {
						System.out.println(-1);
					}
					break;
				case "size": 
					System.out.println(stack.size());
					break;
				case "empty": 
					if(stack.empty()) {
						System.out.println(1);
					} else {
						System.out.println(0);
					}
//					System.out.println(stack.empty());
					break;
				case "top": 
					if(!stack.empty()) {
						System.out.println(stack.peek());
					}else {
						System.out.println(-1);
					}
					break;
				}
				i++;
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
