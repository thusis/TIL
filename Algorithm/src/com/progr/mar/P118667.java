package com.progr.mar;

import java.util.LinkedList;
import java.util.Queue;

public class P118667 {
	
	public static int[] queue1;
	public static int[] queue2;

	public static void main(String[] args) {
		
		int[] queue1 = {3,2,7,2}; // 1,2,1,2	1,1
		int[] queue2 = {4,6,5,1}; // 1,10,1,2	1,5
		
		int answer = solution(queue1, queue2);
		System.out.println(answer);
	}

	private static int solution(int[] queue1, int[] queue2) {
		int answer = -2;

		Queue<Integer> q1 = new LinkedList<>();
		Queue<Integer> q2 = new LinkedList<>();
	
		int total1 = 0;
		int total2 = 0;
		int equalTotal = 0;
		
		//step1 : queue 생성, 각 합 구하기-------------------------------
		for(int i=0; i<queue1.length; i++) {
			q1.add(queue1[i]);
			total1 = queue1[i];
		}
		
		for(int i=0; i<queue2.length; i++) {
			q2.add(queue2[i]);
			total2  = queue2[i];
		}
		
		if(( total1 + total2 ) % 2 != 0) { return -1; }
		equalTotal = ( total1 + total2 ) / 2;
		
		System.out.println("모든원소의 합: " + total1 + total2);
		
		//step2 : 보다 큰 합을 배출하는 큐를 선별하여 poll하고 다른 쪽에 add하기. 개별 합이 equalTotal 과 같아질 때까지 반복-------------------------------
		/**
		 * 매번 개별 합 어떻게 구할건데? static method(
		 */
		
		Queue<Integer> max = biggerQue(q1, q2);
//		Math.max(total1, total2);
		
		
		//step3-------------------------------
		
		
		
		
		
		
		return answer;
	}


}
