package com.progr.mar;

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
	 *  
	 */
	public static int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = {};
		
	        
	        
	        
	        
        return answer;
    }

}
