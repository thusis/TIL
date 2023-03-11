package com.backjoon.mar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2751 {
//수 정렬하기2
	
	private static int[] sorted; 
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int[] arr = new int[Integer.parseInt(br.readLine())];
			for(int i=0; i<arr.length; i++) {
				arr[i] = Integer.parseInt(br.readLine());
			}
			
			merge_sort(arr);
			
			for(int i=0; i<arr.length; i++) {
				bw.write(arr[i]+"\n");
			}
			bw.close();
	        br.close();

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
/**
 * package com.algorithm.sort;의
 * MergeSortBottomUp 클래스 참조
 */
	private static void merge_sort(int[] arr) {
		sorted = new int[arr.length];
		merge_sort(arr, 0, arr.length-1);
		sorted = null;
	}

	private static void merge_sort(int[] arr, int start, int end) {
		for(int size = 1; size<=end; size += size) {
			for(int l=0; l<= end-size; l+=(2*size)) {
				int low = l;
				int mid = l+size-1;
				int high = Math.min(l+(2*size)-1, end);
				merge(arr,low,mid,high);
			}
		}
		
	}

	private static void merge(int[] arr, int left, int mid, int right) {
		int l = left;
		int r = mid + 1;
		int i = left; //인덱스
		
		while ( l <= mid && r <= right ) {
			if(arr[l] <= arr[r]) {
				sorted[i] = arr[l];
				i++;
				l++;
			} else {
				sorted[i] = arr[r];
				i++;
				r++;
			}
		}
		
		if(l>mid) {
			while(r<=right) {
				sorted[i] = arr[r];
				i++;
				r++;
			}
		} else {
			while(l<=mid) {
				sorted[i] = arr[l];
				i++;
				l++;
			}
		}
		
		for(int j = left; j<=right; j++) {
			arr[j] = sorted[j];
		}
	}
}
