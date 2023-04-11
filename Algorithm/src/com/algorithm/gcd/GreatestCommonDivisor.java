package com.algorithm.gcd;

public class GreatestCommonDivisor {
	// 최대공약수 GCD 와 유클리드 호제법
	// 참고 : https://st-lab.tistory.com/154#algorithm
	
	// 1) 반복문 방식
	int gcd(int a, int b) {
		while(b!=0) {
			int r = a%b;
			a=b;
			b=r;
		}
		return a;
	}
	
	// 2) 재귀 방식
	int gcd2(int a, int b ) {
		if(b==0) return a;
		return gcd2(b, a%b);
	}
	
	// 3) 최소공배수
	int lcm(int a, int b) {
		return a*b/gcd(a,b);
	}
	

}
