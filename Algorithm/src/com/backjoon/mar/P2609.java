package com.backjoon.mar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2609 {
	//최대 공약수, 최소 공배수 출력
	public static void main(String[] args) {
		//첫째 줄에는 두 개의 자연수가 주어진다. 이 둘은 10,000이하의 자연수이며 사이에 한 칸의 공백이 주어진다.
		/**
		 * 유클리드 호제법
		 */
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		try {
			input = br.readLine();
			int a = Integer.parseInt(input.split(" ")[0]);
			int b = Integer.parseInt(input.split(" ")[1]);
			int big = Math.max(a, b);
			int small = Math.min(a, b);
			
			int i=0;
			if(big%small!=0) {
				i = big%small;
				if(small%i!=0) {
					int j = small%i;
					
					
				}
			}
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
