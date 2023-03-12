package com.backjoon.mar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SolvedP1037 {
//약수
	public static void main(String[] args) {
		/**
		 * N : N은 A의 배수, 
		 * A : 1이나 N이 아니다 | A는 N의 약수
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<>();
		try {
			int number = Integer.parseInt(br.readLine());
			String[] strs = br.readLine().split(" ");
			
			for(String str : strs) {
				list.add(Integer.parseInt(str));
			}
			
			Collections.sort(list);
			
			int output = list.get(0)*list.get(number-1);
			System.out.println(output);
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
