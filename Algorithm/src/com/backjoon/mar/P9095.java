package com.backjoon.mar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9095 {
//1, 2, 3 더하기
	public static void main(String[] args) {
		/**
		 * 정수 n(1~11)이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램
		 * 1 초 (추가 시간 없음) >> BufferedWriter 써야하나..?
		 * 4 : 31/22/211/1111
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int n = Integer.parseInt(br.readLine());
			int result;
			
			//하나씩 가자
			for(int i=0; i<n; i++) {
				int a = Integer.parseInt(br.readLine());
				
				
				
			}
			
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
