package com.algorithm.sort;

public class MergeSortPrtc {
	private static int[] sorted;
	
	public static void merge_sort(int[] a) {
		sorted = new int[a.length];
		merge_sort(a, 0, a.length-1); // Bottom-up방식으로 구현되는 병합정렬, 왼쪽
	}

	private static void merge_sort(int[] a, int i, int j) {
		for(int size = 1; size <= j; size += size) { //size는 공차..네?
			
			for ( int l=0; l<=j-size; l += (2*size)) {
				int low = l;
				int mid = l + size - 1;
				int high = Math.min(l+(2*size)-1, j);
				
			}
			
		}
		
	}

}
