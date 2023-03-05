package com.backjoon.mar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class P18258 {
	//큐2
	/**
push X: 정수 X를 큐에 넣는 연산이다.
pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.=>> poll()
size: 큐에 들어있는 정수의 개수를 출력한다.
empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다. => peek()
back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	 */
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			int back = 0;
			Queue<Integer> queue = new LinkedList<Integer>();

			for(int i=0; i<n; i++) {
				String input = br.readLine();
				switch(input.split(" ")[0]) {
				case "push": 
					queue.add(Integer.parseInt(input.split(" ")[1])); 
					back = Integer.parseInt(input.split(" ")[1]);
					break;
				case "front": 
					if(queue.isEmpty()) { System.out.println(-1); }
					else { System.out.println(queue.peek()); }
					break;
				case "back" :
					if(queue.isEmpty()) { System.out.println(-1); }
					else { 
						System.out.println(back);
					} 
					break;
				case "size": System.out.println(queue.size()); break;
				case "empty" : 
					if(queue.isEmpty()) { System.out.println(1); }
					else { System.out.println(0); } break;
				case "pop" :
					if(queue.isEmpty()) { System.out.println(-1); }
					else { System.out.println(queue.poll()); }
				}
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
