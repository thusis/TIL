package com.backjoon.mar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class P1260_DfsBfs {
//https://www.acmicpc.net/problem/1260
	
	public static void main(String[] args) {
		/**
		 * 그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램을 작성
		 * input>
		 *  N(1 ≤ N ≤ 1,000) 정점의 개수
		 *  M(1 ≤ M ≤ 10,000) 간선의 개수
		 *  V 탐색을 시작할 정점의 번호
4 5 1
1 2
1 3
1 4
2 4
3 4
		 * output>
		 * DFS를 수행한 결과
		 * BFS를 수행한 결과
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			int n = Integer.parseInt(str.split(" ")[0]);
			int m = Integer.parseInt(str.split(" ")[1]);
			int v = Integer.parseInt(str.split(" ")[2]);
			
			DfsGraph(n); // 정점이 n 개인 DfsGraph 만들기
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

		
	}

	private static void DfsGraph(int n) {
		LinkedList<Integer> adj[];
		adj = new LinkedList[n];
		
		for(int i=0; i<n; ++i) {
			adj[i] = new LinkedList();
		}
	}

}
