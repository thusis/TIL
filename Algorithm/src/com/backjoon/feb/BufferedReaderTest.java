package com.backjoon.feb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BufferedReaderTest {
	public static void main(String[] args) {
		
		caseScanner();
		caseBufferedReader();
		
		//여러 줄일 때
		linesBufferedReader();

	}

	private static void linesBufferedReader() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		try {
			while ((line = br.readLine()) != null) {
				String[] tokens = line.split("\\s");
				System.out.println(Arrays.toString(tokens));
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private static void caseBufferedReader() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		try {
			st = new StringTokenizer(br.readLine());

			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int z = Integer.parseInt(st.nextToken());
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private static void caseScanner() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
	}

}
