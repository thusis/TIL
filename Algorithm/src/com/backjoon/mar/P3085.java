package com.backjoon.mar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P3085 {
//사탕게임 - 2차원 배열 패스!
	public static void main(String[] args) {
		/**
		 *  N×N크기에 사탕을 채워 놓는다. (3<= 5 <= 50)
		 *  C 빨강
		 *  P 파랑
		 *  Z 초록
		 *  Y 노랑
		 *  인접한 두 칸의 사탕을 서로 교환한 후, 같은 색의 연속 부분을 모두 먹는다고 할 때
		 *  상근이가 먹을 수 있는 사탕의 최대 개수를 구하라
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			
		
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
