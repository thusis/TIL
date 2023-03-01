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
				String input = br.readLine();
				xArr[i] = Integer.parseInt(input.split(" ")[0]);
				yArr[i] = Integer.parseInt(input.split(" ")[1]);
				
				/** 이미 있는 것들(xArr[j])과 비교를 한다면 새로운 값(xArr[i])이 추가될 때마다 for문이 돌아가고 바로바로 겹치는 부분을 빼야 함
				 * 겹치는 부분의 경우 : (10 - (x축 두 수의 차의 절대값)) * (10 - (y축 두 수의 차의 절대값))  
				 */
				
				System.out.println(i+"번째 배열 : ("+xArr[i]+","+yArr[i]+")");
				
				if(i>0) {
					
					int minus = 0; // 뺄 값
					
					for(int j=0; j<i; j++) {
						int xMinReplace = xArr[i]-10;
						int yMinReplace = yArr[i]-10;
						if(xArr[i]<10) {xMinReplace = 0;}
						if(yArr[i]<10) {yMinReplace = 0;}
						
						if((xMinReplace< xArr[j] && xArr[j]<xArr[i]+10) //조건1-1
								&& (yMinReplace< yArr[j] && yArr[j]<yArr[i]+10)) { //조건2-1
							minus = minus + (10-Math.abs(xArr[i]-xArr[j]))*(10-Math.abs(yArr[i]-yArr[j])); 
							System.out.println(i+"번째 input을 "+j+" 번째 값("+xArr[j]+","+yArr[j]+")이랑 비교했을 때 뺄 값:" +minus);
						}
						if(minus>=100) {
							minus = 100;
							break;
						}
					}
					result = result - minus;
				}
				
			}
			System.out.println(result);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
