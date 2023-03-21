package com.algorithm.dfsbfs;

import java.util.Iterator;
import java.util.LinkedList;

public class BfsGraph {
	/*
	 * ( 출처 : https://www.youtube.com/watch?v=7C9RgOcvkvo )
	 * BFS Breadth-First Search
	 * 너비 우선 탐색
	 * 
	 * 그래프에서 가까운 노드부터 우선적으로 탐색하는 알고리즘
	 * 큐 자료구조를 이용하며, 구체적 동작과정은 다음과 같다
	 * 
	 * 1. 탐색 시작 노드를 큐에 삽입하고 방문 처리를 한다
	 * 2. 큐에서 노드를 꺼낸 뒤에 해당 노드의 인접 노드 중에서 방문하지 않은 노드를 모두 큐에 삽입하고 방문처리한다
	 * 3. 더 이상 2번의 과정을 수행할 수 없을 때까지 반복한다
	 * 
	 *================================================================
	 * (출처: https://devuna.tistory.com/32)
	 * Java에서 BFS 구현 - 큐 이용
	 */
	
	private int V;
	private LinkedList<Integer> adj[];//링크드리스트의 배열
	
	//constructor
	BfsGraph(int v){
		V=v;
		adj = new LinkedList[v];
		//v개의 LinkedList 선언 및 생성
		for(int i=0; i<v; ++i) {
			adj[i] = new LinkedList();
		}
	}
	
	void addEdge(int v, int w) {//v번째 LinkedList 에 w 를 삽입
		adj[v].add(w);
	}
	
	//BFS 함수
	void BFS(int s) {
		boolean visited[] = new boolean[V]; //각 노드의 방문여부 저장
		LinkedList<Integer> queue = new LinkedList<Integer>();//연결리스트 생성
		
		visited[s] = true;
		queue.add(s); 
			/*
			 * DFS는 int v와 boolean[] visited스스로를 호출해서 스스로를 호출하고, !visited[n]의 경우를 체크하는 식으로 탐색을 했는데
			 * BFS는 Queue를 이용해, !visited[n]의 경우 enqueue, visited[n]의 경우 dequeue 하며 최단거리를 탐색한다
			 */
		
		while(queue.size()!=0) {
			//방문한 노드를 큐에서 추출(dequeue)하고 값을 출력
			s = queue.poll();
			System.out.println(s+" ");
			
			//방문한 노드와 인접한 모든 노드를 가져온다
			Iterator<Integer> i = adj[s].listIterator();
			while(i.hasNext()) {
				int n = i.next();
				
				//방문하지 않은 노드면 방문한 것으로 표시하고 큐에 삽입(enqueue)
				if(!visited[n]) {
					visited[n]=true;
					queue.add(n);
				}
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
