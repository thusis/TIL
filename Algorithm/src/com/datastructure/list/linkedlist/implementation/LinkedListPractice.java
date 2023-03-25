package com.datastructure.list.linkedlist.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class LinkedListPractice {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder(reader.readLine());
		int n = Integer.parseInt(reader.readLine());
		
		Stack lStack = new Stack<>();
		Stack rStack = new Stack<>();
		for(int i = 0; i < str.length(); i++)
			lStack.add(str.charAt(i));
		
		while(n-- > 0) {
			String cmd = reader.readLine();

			if(cmd.contains("P"))
				lStack.add(cmd.charAt(2));
			else {
				switch(cmd) {
				case "L": 
					if(!lStack.isEmpty())
						rStack.add(lStack.pop());
					break;
				case "D": 
					if(!rStack.isEmpty())
						lStack.add(rStack.pop());
					break;
				case "B": 
					if(!lStack.isEmpty())
						lStack.pop();
					break;
				}
			}
		}
		while(!lStack.isEmpty()) rStack.add(lStack.pop());
		while(!rStack.isEmpty()) System.out.print(rStack.pop());
	}
}
