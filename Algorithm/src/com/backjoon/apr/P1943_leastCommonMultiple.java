package com.backjoon.apr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1943_leastCommonMultiple {

	//문제 번호 : www.acmicpc.net/problem/1934
	//참고 : https://st-lab.tistory.com/193
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int N = Integer.parseInt(br.readLine());
			StringBuilder sb = new StringBuilder();
			StringTokenizer st;
			
			for( int i=0; i<N; i++ 	) {
				st = new StringTokenizer(br.readLine(), " ");
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				
				int d = gcd(a,b);
				
				sb.append(a*b / d).append('\n');
			}
			
			System.out.println(sb);
		
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 최대공약수 반복문 방식
	private static int gcd(int a, int b) {
		
		while( b!= 0 ) {
			int r = a % b; // 나머지를 구해준다.
			
			//GCD(a, b) = GCD(b, r)이므로 변환한다.
			a = b;
			b = r;
		}
		return a;
	}
}
