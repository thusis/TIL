package com.backjoon.feb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2563 {
	// 색종이
	public static void main(String[] args) {
		/**
		 * 
		 * 3
		 * 3 7
		 * 15 7
		 * 5 2
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine().split(" ")[0]);
			int result = n*100;
			int[] xArr = new int[n];
			int[] yArr = new int[n];
			
			for(int i=0; i<n; i++) {
				int minus = 0;
				String input = br.readLine();
				xArr[i] = Integer.parseInt(input.split(" ")[0]);
				yArr[i] = Integer.parseInt(input.split(" ")[1]);
				
				/** 이미 있는 것들(xArr[j])과 비교를 한다면 새로운 값(xArr[i])이 추가될 때마다 for문이 돌아가고 바로바로 겹치는 부분을 빼야 함
				 * 겹치는 부분의 경우 : (10 - (x축 두 수의 차의 절대값)) * (10 - (y축 두 수의 차의 절대값))  
				 */
				if(i>0) {
					for(int j=0; j<i; j++) {
						if((xArr[i]-10< xArr[j] && xArr[j]<xArr[i]+10) 
								&& (yArr[i]-10< yArr[j] && yArr[j]<yArr[i]+10)) {
							minus = (10-Math.abs(xArr[i]-xArr[j]))*(10-Math.abs(xArr[i]-xArr[j]));
							result = result - minus;
						}
					}
				}
				System.out.println(result);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
