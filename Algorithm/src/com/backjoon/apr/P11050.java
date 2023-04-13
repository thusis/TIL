package com.backjoon.apr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11050 {
//https://st-lab.tistory.com/159#%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98
	public static void main(String[] args) throws IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
 
		// nCk = n! / ((n-k)! * k!)
		System.out.println(factorial(N) / (factorial(N - K) * factorial(K)));
	}
 
	static int factorial(int N) {
		// factorial(0) == 1 이다. 
		if (N <= 1)	{
			return 1;
		}
		return N * factorial(N - 1);
	}
	
}
