package com.backjoon.mar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class P17427 {
	//약수의 합 - 시간 복잡도 O(n−−√)
	public static void main(String[] args) {
		/**
		 * 0.5 초 (추가 시간 없음)
		 *  f(A) = 자연수 A의 약수의 합
		 *  g(x) = x보다 작거나 같은 모든 자연수 y의 f(y)값을 더한 값
		 */		

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			
			int ga = 0;
			
			for(int i=1; i<=n; i++) { // 시간복잡도 : O(sqrt(n)) * n
//				HashSet<Integer> set = getYaksu(i);
//				int fa = getYaksuHab(set);
				int fa = getYaksuHab(i);
				ga = ga + fa;
				System.out.println(i+"의 약수의 합인 "+fa+"를 합한 값은 "+ga+"\n");
			}
			
			System.out.println(ga);
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

	private static int getYaksuHab(int n) {
		int result = 0;
		
		for(int i=1; i<=Math.sqrt(n); i++) {//현재 n에 대한 시간 복잡도 O(sqrt(n))
			if( n % i == 0 ) {
				if(i!=n/i) { result = result  + i + n/i;}
				else { result = result + i; }
			}
		}
		return result;
	}

}
