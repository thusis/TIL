package com.backjoon.apr;

public class P4949_balancedWorld {
//https://st-lab.tistory.com/180
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
		String s;
		
		while(true) {		
			s = in.nextLine();
			
			if(s.equals(".")) {	// 종료 조건문 
				break;
			}		
			System.out.println(solve(s));
		}
	
	}
	
	public static String solve(String s) {
		
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < s.length(); i++) {
			
			char c = s.charAt(i);	// i 번째 문자 
			
			// 여는 괄호일 경우 스택에 push 
			if(c == '(' || c == '[') {
				stack.push(c);
			}
			
			// 닫는 소괄호 일 경우 
			else if(c == ')') {
				
				// 스택이 비어있거나 pop할 원소가 소괄호랑 매칭이 안되는 경우 
				if(stack.empty() || stack.peek() != '(') {
					return "no";
				}
				else {
					stack.pop();
				}
			}
			
			else if(c == ']') {
				
				// 스택이 비어있거나 pop할 원소가 대괄호랑 매칭이 안되는 경우 
				if(stack.empty() || stack.peek() != '[') {
					return "no";
				}
				else {
					stack.pop();
				}
			}
			
			// 그 외의 경우에는 불필요한 문자들이기에 skip한다. 
		}
		
		if(stack.empty()) {
			return "yes";
		}
		else {
			return "no";
		}
	}

}
