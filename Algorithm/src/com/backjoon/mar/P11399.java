package com.backjoon.mar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class P11399 {

	/**
	 * 
	 * @param n 사람의 수 N(1 ≤ N ≤ 1,000)
	 * @param int[] p 각 사람이 돈을 인출하는데 걸리는 시간 Pi (1 ≤ Pi ≤ 1,000)
	 * @param result 각 사람이 돈을 인출하는데 필요한 시간의 합의 최솟값
	 */
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			
			int n = Integer.parseInt(br.readLine());
			String str = br.readLine();
			ArrayList<Integer> p = new ArrayList<>();
			for(int i=0; i<n; i++) {
				p.add(Integer.parseInt(str.split(" ")[i]));
			}
			
			Collections.sort(p);
			int temp = 0;
			int result = 0;
			for(int i=0; i<p.size();i++) {
				temp += p.get(i);
				result += temp;
			}
			System.out.println(result);
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
