package com.backjoon.mar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2869dalpengi {
	//달팽이는 올라가고 싶다 
	public static void main(String[] args) {
		/**
		 * 시간 제한 0.25초
		 * A, B, V (1 ≤ B < A ≤ V ≤ 1,000,000,000)
		 * A 낮에 올라감
		 * B 밤에 내려감
		 * V 높이
		 */
//		tryFirst();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String[] input = br.readLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			int v = Integer.parseInt(input[2]);
			
			if(v<a) {
				System.out.println(1);
				return;
//			} else if ( v<=(v-a)*(a-b)+a ) {
			} else if ( (v>=a) && (b!=a-1) ) {
				System.out.println(v-a+1);
			} else {
				System.out.println(Math.ceil(v/(a-b)));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
	private static void tryFirst() {
//		System.out.println(Math.ceil(1.0)); // 1.0
//		System.out.println(Math.ceil(1.5)); // 2.0
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String[] input = br.readLine().split(" ");
			long x = Long.parseLong(input[0]) - Long.parseLong(input[1]);
			long v = Long.parseLong(input[2]);
			
			long day = v / x;
			
			System.out.println("하루에 "+x+"만큼 올라갈 때 "+v+"까지 올라가려면 "+day+"만큼 걸린다");
			
			
			
			if(v < Long.parseLong(input[0])) {
				System.out.println(1);
				return;
			} else if ( v < x*Math.floor(day-1)+Long.parseLong(input[0])) {
				System.out.println(Math.ceil(day-1));
			} else {
				System.out.println(Math.ceil(day));
			}
			
		/* 1 만약 v < a 라면 output = 1
		 * 2 만약 x * Math.floor(day-1) + a > v 라면 output = Math.floor(day-1)
		 * 3 그 외의 경우 output =Math.floor(day)
		 */
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
