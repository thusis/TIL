package com.backjoon.mar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class SolvedP10773 {
	//제로
	/**
	 * 0을 부른 경우 가장 최근에 재민이가 쓴 수가 지워진다 => stack.pop();
	 * 모든 수의 합을 출력한다  
	 */
	
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int k = Integer.parseInt(br.readLine());
			
			Stack<Integer> stack = new Stack<>();
			for(int i = 0; i<k; i++) {
				int n = Integer.parseInt(br.readLine().split(" ")[0]);
				if(n==0) {
					stack.pop();
				}else {
					stack.push(n);
				}
//				System.out.println(i+"번째 입력값("+n+")에 대한 Stack: "+stack);
			}
			int output = 0;
			while(!stack.empty()) {
				output = output + stack.pop();
			}
			System.out.println(output);
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
