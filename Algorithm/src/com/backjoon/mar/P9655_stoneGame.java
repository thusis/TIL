package com.backjoon.mar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 
 * 1 or 3
 * 돌의개수N  5		6			7
 * 상근이		3 1		3  | 1 1	3 3 | 1
 * 창영이		1		3  | 3 1	1	| 1
 * 			sk		cy   cy		sk
 * 
 * 7(331/31111/1111111) : 항상 홀
 * 8(3311/311111/1*8) :항상짝
 * 9(333/33111/1*9)  :항상홀
 * 10(3331/331111/1*10) :항상짝
 * 11(33311/3311111/1&11) : 항상 홀
 * 짝 홀 짝
 * 12(3*4 + 1*0) 4
 * 13(3*4 + 1*1) 5
 * 14(3*4 + 1*2) 6ㅇ
 * 홀 짝 홀
 * 15(3*5ㅇ
 * 16(3*5 + 1*1
 * 17(3*5 + 1*2
 * 짝 홀 짝
 * 18(3*6
 * 19(3*6 + 1*1
 * 20(
 * 
 * 마지막 돌을 가져가는 사람이 이긴다
 */
public class P9655_stoneGame {
	public static void test(String[] args) { //일반
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		try {
			n = Integer.parseInt(br.readLine());
			if(n%2==0) {
				System.out.println("CY");
			}else {
				System.out.println("SK");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
    public static void main(String[] args) throws IOException { //DP로
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[1001];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 1;
        for (int i = 4; i <= n; i++) {
            dp[i] = Math.min(dp[i-1],dp[i-3]) + 1;
        }
        if (dp[n] % 2 == 0) {
            System.out.print("CY");
        } else {
            System.out.print("SK");
        }
    }

}
