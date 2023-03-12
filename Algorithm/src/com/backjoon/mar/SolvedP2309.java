package com.backjoon.mar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class SolvedP2309 {
//일곱난쟁이 : 일곱 난쟁이의 키의 합이 100
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList();
		int total = 0;
		try {
			for(int i=0; i<9; i++) {
				int n = Integer.parseInt(br.readLine());
				total = total + n;
				list.add(n);
			}
			Collections.sort(list);
			for(int i=0; i<8; i++) {
				int add = 0;
				for(int j=i+1; j<9; j++) {
					// 0 : 1 2 3 4 5 6 7 8 
					// 1 : 2 3 4 5 6 7 8
					// 2 : 3 4 5 6 7 8
					// .. 7 : 8
					add = list.get(i) + list.get(j);
					if(total - add == 100) {
						System.out.println(list.get(i)+","+list.get(j)+"를 제외한 나머지");
						list.remove(j);
						list.remove(i);
						break;
					}
				}
				if(total - add == 100) {
					break;
				}
			}
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i));
			}
			
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
