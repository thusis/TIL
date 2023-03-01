package com.backjoon.mar.stack;

public class Node {
	/**
	 * [LinkedList 로 Stack 구현]
	 * 1 
	 * 링크드리스트 특성상 스택의 크기가 고정되어 있지 않은 점에서 장점
	 * 2 
	 * 링크드리스트로 스택을 구현하려면 Node 가 필요하다.
	 * Node는 데이터(node)와, 다음 데이터를 가르키는 주소(Node.next)로 구성되어 있다
	 */
	
	private int item;
	private Node node;
	
	public Node(int item) {
		this.item = item;
		this.node = null;
	}
	
	protected void linkNode(Node node) {
		this.node = node;
	}
	
	protected int getData() {
		return this.item;
	}
	
	protected Node getNextNode() {
		return this.node;
	}
}
