package com.datastructure.list.linkedlist.implementation;

public class LinkedList {
	//LinkedList 구현하기
	//https://www.youtube.com/watch?v=x22G_r0cln4 생활코딩
	
	private Node head;
	private Node tail;
	private int size = 0;
	
	private class Node {//하나의 노드는 (1) 데이터필드 (2) 링크필드(다음 노드가 무엇인지) 로 구성됨

		private Object data;
		private Node next; 
		/**
		 * @param input 어떤 노드가 처음 생성됐을 때 들어가는 값
		 * next : 당장 다음 노드는 null인 상태
		 */
		public Node(Object input) {
			this.data = input;
			this.next = null;
		}
		
		public String toString() {
			return String.valueOf(this.data);
		}
		
	}
	
	public void addFirst(Object input) {
		Node newNode = new Node(input);
		newNode.next = head;
		head = newNode;
		size++;
		if(head.next==null) {
			tail = head;
		}
	}

	public void addLast(Object input) {
		Node newNode = new Node(input);
		if(size==0) {
			addFirst(input);
		} else {
			tail.next = newNode;
			tail = newNode;
			size++;
		}
	}
	
	Node node(int index) {
		Node x = head;
		for(int i=0; i<index; i++) {
			x = x.next;
		}
		return x;
	}

	public void add(int k, Object input) {
		if(k==0) {
			addFirst(input);
		} else {
			/* index인 k가 1 이라면 
			 * 기존의 0 과 1 사이의 연결을 끊어야 하기 때문에, 
			 * index k-1 의 Node 값을 알아야 한다
			 */
			Node temp1 = node(k-1);
			Node temp2 = temp1.next; // 기존의 k번째 노드는 임시값에 담아놓기
			Node newNode = new Node(input);
			
			temp1.next = newNode;
			newNode.next = temp2; //네 개의 노드 새로 연결해주기
			size++;
			if(newNode.next==null) {
				tail = newNode;
			}
		}
	}
	
	public String toString() {
		if(head==null) {
			return "[]";
		}
		
		Node temp = head;
		String str = "[";
		
		while(temp.next!=null) {
			str += temp.data + ",";
			temp = temp.next;
		}
		
		return str + "]";
	}

	public Object removeFirst() {
		Node temp = head;
		head = head.next;
		Object returnData = temp.data;
		temp = null;
		size--;
		return returnData;
	}

	public Object remove(int k) {
		if(k==0) {
			return removeFirst();
		}
		Node temp = node(k-1);
		Node todoDeleted = temp.next; //삭제하려는 노드
		temp.next = temp.next.next;
		Object returnData = todoDeleted.data;
		if(todoDeleted == tail) {
			tail = temp;
		}
		todoDeleted = null;
		size--;
		return returnData;
	}

	public Object removeLast() {
		/*
		 * ArrayList의 경우 배열 안 각 원소의 index를 알고 있으면 특정 위치로 이동해 그를 삭제할 수 있지만 
		 * LinkedList의 경우 각 Node들은 연결되어 있기 때문에 단번에 size-1 로 tail로 이동해 이를 지울 수 없다
		 * 따라서 기존 remove() 메소드를 이용하여 next, next, next.. 로 접근하는 것이 좋은 방법이다
		 * 
		 * 이는 LinkedList의 tail 을 삭제할 때 연산시간이 오래걸릴 것을 함의한다!
		 */
		return remove(size-1);
	}
	//https://www.youtube.com/watch?v=T4oFZYVkrl0 

	
	
}
