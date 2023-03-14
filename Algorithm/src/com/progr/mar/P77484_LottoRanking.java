package com.progr.mar;

import java.util.ArrayList;

public class P77484_LottoRanking {
//https://school.programmers.co.kr/learn/courses/30/lessons/77484

	public static void main(String[] args) {
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		
		int[] result = solution(lottos, win_nums);
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i]+" ");
		}
	}
	
	/**
	 * 알아볼 수 없는 번호 -
	 * @param lottos 민우가 구매한 로또 번호 6개 (0~45, 0 이외에 중복 없음)
	 * @param win_nums 당첨 번호 6개 (1~45)
	 * 
	 * @return
	 * 
	 * 순서와 상관x
	 * 당첨 가능한 최고 순위와 최저 순ㄴ위
	 * 
	 * STEP1-----
	 * lottos = int[] 0 + int[] numbers | 0의 개수 세기, 0의 배열을 제외한 그 밖의 번호들로 재구성
	 * win_nums = int[] numbers + int[] others | numbers와 비교해 일치하는 개수 count(++), 그 밖의 것 othres로 담기
	 */
	public static int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = {};
		
//		ArrayList<Integer> numbers = new ArrayList<>();
//		int count = 0;
//		
//		for(int i=0; i<lottos.length; i++) {
//			if(lottos[i] == 0) {
//				count++;
//			} else {
//				numbers.add(lottos[i]);
//				// 아니면 1~45까지의 
//			}
//		}
		
		ArrayList<String> numbers = new ArrayList<>();
		for(int i=1; i<=45; i++) {
			numbers.add(i+"");
		}
		
		int count = 0; 
		for(int i=0; i<lottos.length; i++) {
			if(lottos[i]==0) {
				count++;
			} else {
				numbers.remove(lottos[i]+""); //ArrayList.remove()의 파라미터로 정수가 들어가면 자동으로  index로 인식하여 해당 인덱스의 값을 삭제하기 때문에, String 으로 선언했다
			}
		}
		
		int win_count = 6;
		for(int i=0; i<6; i++) {
			if(numbers.remove(win_nums[i]+"")) { // 민우가 뽑은 수를 제외한 번호 중 win_num과 겹치는 수가 있다면 지워짐 => 민우가 못 뽑았음. 즉 
				win_count--;
			}
		}
		
		
		
	        
	        
	        
	        
        return answer;
    }

}
