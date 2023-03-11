package com.algorithm.sort;

public class MergeSortBottomUp {
	//대부분의 경우 정렬 과정은 최대한 재귀는 피하여 구현하는게 일반적이기 때문에 Bottom-Up 으로 구현하는 것이 좋다.
	
	private static int[] sorted;		// 합치는 과정에서 정렬하여 원소를 담을 임시배열
	
	public static void merge_sort(int[] a) {
		sorted = new int[a.length];
		merge_sort(a, 0, a.length - 1);
		sorted = null;
	}
	
	// Bottom-Up 방식 구현
	private static void merge_sort(int[] a, int left, int right) {
		/*
		 * 1 - 2 - 4 - 8 - ... 식으로 1부터 서브리스트를 나누는 기준을 두 배씩 늘린다.
		 */
		for(int size = 1; size <= right; size += size) {
			/*
			 * 두 부분리스트을 순서대로 병합해준다.
			 * 예로들어 현재 부분리스트의 크기가 1(size=1)일 때
			 * 왼쪽 부분리스트(low ~ mid)와 오른쪽 부분리스트(mid + 1 ~ high)를 생각하면
			 * 왼쪽 부분리스트는 low = mid = 0 이고,
			 * 오른쪽 부분리스트는 mid + 1부터 low + (2 * size) - 1 = 1 이 된다.
			 *  
			 * 이 때 high가 배열의 인덱스를 넘어갈 수 있으므로 right와 둘 중 작은 값이
			 * 병합되도록 해야한다. 
			 */
			for(int l = 0; l <= right - size; l += (2 * size)) {
				int low = l;
				int mid = l + size - 1;
				int high = Math.min(l + (2 * size) - 1, right);
				merge(a, low, mid, high);		// 병합작업
			}
		}
	}
	
	/**
	 * 합칠 부분리스트는 a배열의 left ~ right 까지이다. 
	 * 
	 * @param a		정렬할 배열
	 * @param left	배열의 시작점
	 * @param mid	배열의 중간점
	 * @param right	배열의 끝 점
	 */
	private static void merge(int[] a, int left, int mid, int right) {
		int l = left;		// 왼쪽 부분리스트 시작점
		int r = mid + 1;	// 오른쪽 부분리스트의 시작점 
		int idx = left;		// 채워넣을 배열의 인덱스
		
		
		while(l <= mid && r <= right) {
			/*
			 *  왼쪽 부분리스트 l번째 원소가 오른쪽 부분리스트 r번째 원소보다 작거나 같을 경우
			 *  왼쪽의 l번째 원소를 새 배열에 넣고 l과 idx를 1 증가시킨다.
			 */
			if(a[l] <= a[r]) {
				sorted[idx] = a[l];
				idx++;
				l++;
			}
			/*
			 *  오른쪽 부분리스트 r번째 원소가 왼쪽 부분리스트 l번째 원소보다 작거나 같을 경우
			 *  오른쪽의 r번째 원소를 새 배열에 넣고 r과 idx를 1 증가시킨다.
			 */
			else {
				sorted[idx] = a[r];
				idx++;
				r++;
			}
		}
		
		/*
		 * 왼쪽 부분리스트가 먼저 모두 새 배열에 채워졌을 경우 (l > mid)
		 * = 오른쪽 부분리스트 원소가 아직 남아있을 경우
		 * 오른쪽 부분리스트의 나머지 원소들을 새 배열에 채워준다.
		 */
		if(l > mid) {
			while(r <= right) {
				sorted[idx] = a[r];
				idx++;
				r++;
			}
		}
		
		/*
		 * 오른쪽 부분리스트가 먼저 모두 새 배열에 채워졌을 경우 (r > right)
		 * = 왼쪽 부분리스트 원소가 아직 남아있을 경우
		 * 왼쪽 부분리스트의 나머지 원소들을 새 배열에 채워준다.
		 */
		else {
			while(l <= mid) {
				sorted[idx] = a[l];
				idx++;
				l++;
			}
		}
		
		/*
		 * 정렬된 새 배열을 기존의 배열에 복사하여 옮겨준다.
		 */
		for(int i = left; i <= right; i++) {
			a[i] = sorted[i];
		}
	}
}
