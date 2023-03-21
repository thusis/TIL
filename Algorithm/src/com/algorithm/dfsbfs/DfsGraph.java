package com.algorithm.dfsbfs;

import java.util.Iterator;
import java.util.LinkedList;

public class DfsGraph {
	/*
	 * (출처: https://www.youtube.com/watch?v=7C9RgOcvkvo)
	 * 		ㄴ 유튜브 그림 같이 보며 이해하기
	 * DFS Depth-First-Search
	 * 깊이 우선 탐색
	 * 
	 * : 깊은 부분 우선적 탐색
	 * 스택 자료구조(혹은 재귀함수)를 이용
	 * 1. 탐색 시작 노드를 스택에 삽입하고 방문처리
	 * 2. 스택의 최상단 노드에 방문하지 않은 인접한 노드가 하나라도 있으면 그 노드를 스택에 넣고 방문처리
	 *	  방문하지 않은 인접 노드가 없으면 스택에서 최상단 노드를 꺼냄
	 * 3. 더 이상 2번의 과정을 수행할 수 없을 때까지 반복
	 * =============================================================
	 * 
	 * (출처: https://devuna.tistory.com/32)
	 * Java에서 DFS 구현 - 재귀함수 이용
	 * 
	 */
	
	private int V;
	private LinkedList<Integer> adj[]; //링크드리스트의 배열
	
	//constructor
	DfsGraph(int v){
		V = v;
		adj = new LinkedList[v];
		//v개의 LinkedList 선언 및 생성
		for(int i=0; i<v; ++i) {
			adj[i] = new LinkedList();
		}
	}
	
	void addEdge(int v, int w) {// v번째 LinkedList 에 w를 삽입
		adj[v].add(w);
	}
	
	//DFS 함수
	void DFS(int v) {// v를 시작노드로!
		boolean visited[] = new boolean[V]; //각 노드의 방문 여부 저장
		DFSUtil(v, visited);
	}

	private void DFSUtil(int v, boolean[] visited) {
		//현재 노드를 방문한 것으로 체크(visited의 v번째 요소를 true)
		visited[v] = true;
		System.out.println(v + " ");
		
		//방문한 노드와 인접한 모든 노드를 가지고 온다
		Iterator<Integer> it = adj[v].listIterator();
		while(it.hasNext()) {
			int n = it.next();
			
			//방문하지 않은 노드면 해당 노드를 다시 시작 노드로하여 DFSUtil 을 호출
			if(!visited[n]) {
				DFSUtil(n, visited);//재귀호출
			}
		}
	}
	
	/*
	 * 3. DFS, BFS를 활용하면 좋은 상황
	 * DFS와 BFS를 활용하면 좋은 상황으로는 아래와 같은 상황들이 있다.
	 * (1) 그래프의 모든 정점을 방문하는 것이 주요한 문제: 
	 * 		DFS, BFS 모두 무방하다.
	 * (2) 경로의 특징을 저장해둬야 하는 문제: 
	 * 		각 장점에 숫자가 있고 a 부터 b까지 가는 경로를 구하는데 경로에 같은 숫자가 있으면 안된다는 문제 등, 
	 * 		각각의 경로마다 특징을 저장해둬야 하는 경우는 DFS를 사용해야 한다. BFS는 경로의 특징을 저장하지 못한다.
	 * (3) 최단거리를 구하는 문제: 
	 * 		BFS가 유리하다. 
	 * 		DFS의 경우 처음으로 발견되는 해답이 최단거리가 아닐 수 있지만 BFS의 경우 먼저 찾아지는 해답이 곧 최단거리이기 때문이다.
	 */

}
