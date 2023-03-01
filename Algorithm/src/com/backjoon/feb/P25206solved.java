package com.backjoon.feb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P25206solved {
	public static void main(String[] args) {
		/***
		 * 학점: a
		 * 과목평점: b
		 * 전공평점(c) = (학점 x 과목평점)의 총합 / 학점의 총합
		 * 총 과목 개수
		 * 이 때 전공평점이 3.3 이상이어야 한다
		 */
		
		double a = 0; //학점의 총합 = 분모
		double b = 0; //개별 학점
		double c = 0; // 과목평점
		double bunja = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		int n = 1;
		try {
			while((input = br.readLine())!=null) {
//				System.out.println("\n"+n+"번째 input: "+input);
				String[] strArr = input.split(" ");
				b = Double.parseDouble(strArr[1]);
				a = a + b;

				switch(strArr[2]) {
				case "A+": c = 4.5; break;
				case "A0": c = 4.0;	break;
				case "B+": c = 3.5; break;
				case "B0": c = 3.0; break;
				case "C+": c = 2.5;	break;
				case "C0": c = 2.0;	break;
				case "D+": c = 1.5; break;
				case "D0": c = 1.0; break;
				case "F": c = 0.0;	break;
				default: // 등급이 P인 과목은 계산에서 제외해야 한다.
					a = a - b;
					c = 0.0;
				}
				bunja = bunja + b*c;
				
//				System.out.println(n+"번째 누적학점: " + a);
//				System.out.println(n+"번째 개별학점: " + b);
//				System.out.println(n+"번째 과목평점: " + c);
//				System.out.println(n+"번째 분자: " + bunja);
//				System.out.println(n+"번째 전공평점: " + bunja/a);
				if(n==20) {
					System.out.println(bunja/a);
				}
				n++;
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
