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
			
			for(int i=1; i<=n; i++) {
				HashSet<Integer> set = getYaksu(i);
				int fa = getYaksuHab(set);
				ga = ga + fa;
				System.out.println(i+"를 합한 값은 "+ga+"\n");
			}
			
			System.out.println(ga);
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

	private static int getYaksuHab(HashSet<Integer> set) {
		int result = 0;
		Iterator<Integer> setIt = set.iterator();
		while(setIt.hasNext()) {
			int a = setIt.next();
			result = result + a;
			System.out.print(a+" ");
		}
		System.out.println(result);
		return result;
	}

	private static HashSet<Integer> getYaksu(int n) {

		HashSet<Integer> set = new HashSet<>();
		
		for(int i=1; i<=Math.sqrt(n); i++) {
			if( n % i == 0 ) {
				set.add(i);
				set.add(n/i);
			}
		}
		return set;
	}

}
