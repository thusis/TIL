package com.backjoon.mar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P17427 {
	//약수의 합 - 시간 복잡도 O(n−−√)
	public static void main(String[] args) {
		/**
		 * 0.5 초 (추가 시간 없음)
		 *  f(A) = 자연수 A의 약수의 합
		 *  g(x) = x보다 작거나 같은 모든 자연수 y의 f(y)값을 더한 값
		 *  
		 *  ----
		 *  
		 *  1 ) 자연수 N 의 약수(ArrayList<Integer>) 구하기
		 *  	N의 약수를 구할 때는, 1부터 N의 제곱근까지의 수만 0으로 나누어 떨어지는지 확인한다(에라토스테네스의 체)
		 * 
		 *  2 ) 1과 같은 로직으로 1~(N-1) 각각의 약수를 구해, arraylist에 담고 개별합 구하기 - 시그마 이용?
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			double sqrt = Math.sqrt(n);
			
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
