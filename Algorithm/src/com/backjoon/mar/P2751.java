package com.backjoon.mar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class P2751 {
//수 정렬하기2
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int n = Integer.parseInt(br.readLine());

			ArrayList<Integer> list = new ArrayList();
			for(int i=0; i<n; i++) {
				list.add(Integer.parseInt(br.readLine()));
			}
			Collections.sort(list);
			for(int i=0; i<n; i++) {
				System.out.println(list.get(i));
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
