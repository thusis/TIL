package com.backjoon.feb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P25206 {
	public static void main(String[] args) throws IOException {
		/***
		 * 학점: a
		 * 과목평점: b
		 * 전공평점(c) = (학점 x 과목평점)의 총합 / 학점의 총합
		 * 총 과목 개수
		 * 이 때 전공평점이 3.3 이상이어야 한다
		 */
		double a = 0;
		double b = 0;
//		double c = 0;
		int d = 20;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		while((input = br.readLine())!=null) {
			String[] strArr = input.split(" ");
			for(int i=0; i<strArr.length; i++) {
				if(i%3==1) { // 학점
					a = a + Double.parseDouble(strArr[i]);
				}else if(i%3==2) { // 과목평점
					switch(strArr[i]) {
					case "A+": 
						b = b + 4.5;
						break;
					case "A0": 
						b = b + 4.0;
						break;
					case "B+": 
						b = b + 3.5;
						break;
					case "B0": 
						b = b + 3.0;
						break;
					case "C+": 
						b = b + 2.5;
						break;
					case "C0": 
						b = b + 2.0;
						break;
					case "D+": 
						b = b + 1.5;
						break;
					case "D0": 
						b = b + 1.0;
						break;
					case "F": 
						break;
					default: // 등급이 P인 과목은 계산에서 제외해야 한다.
						a = a - Double.parseDouble(strArr[i-1]);
						d = d - 1;
					}
				}
			}
		}
		
//		String[] strArr = usingStringTokenizer(input);
//		String[] strArrB = usingsplit(input);
		
		System.out.println("누적학점: " + a);
		System.out.println("누적과목평점: " + a);
		System.out.println("P를 제외한 총 과목수: " + d);
	}

	private static String[] usingsplit(String input) {
		return input.split(" ");
	}

	private static String[] usingStringTokenizer(String input) {
		StringTokenizer st = new StringTokenizer(input);
		
		System.out.println("총 토큰 갯수:"+st.countTokens());
		String[] strArr = new String[st.countTokens()];
		int i = 0;
		while(st.hasMoreTokens()) {
			strArr[i] = st.nextToken();
			i++;
		}
		
		return strArr;
	}
}
