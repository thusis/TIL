package com.datastructure.stack;

public class NodeManager {
	Node top; //가장 최근에 들어온 노드를 가리킴
	
	public NodeManager() {
		this.top = null;
	}
	
	public void push(int data) {
		Node node = new Node(data); // 노드를 생성
		node.linkNode(top); // 새로 생성된 노드가 top 이 가르키고 있는 노드를 링크로 연결하게 함(포인터 내지 인덱스를 옮긴다고 이해하면 됨)
		top = node;
	}
	
	public void pop() {
		top = top.getNextNode(); // 현재 top 이 가리키고 있는 노드를 가리키게 함
		//getNextNode() 는 다음 노드를 리턴함
	}
	
	public int peek() {
		return top.getData();
	}
	
	/**
	 * 장점은 스택에 들어가는 데이터의 양이 한정되어있지 않고 삽입 삭제가 용이합니다.
	 * (원한다면 중간에 있는 노드를 지울수도 있습니다.) 
	 * 하지만 구현이 어렵고 배열과 달리 조회가 힘들다는 단점이 있습니다.
	 */
}
