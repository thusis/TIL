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
	 * @return answer
	 * 
	 * 순서와 상관x
	 * 당첨 가능한 최고 순위와 최저 순ㄴ위
	 * 
	 * STEP1-----
	 * @count lottos 중 훼손되지 않은 것과 win_nums가 일치하는 개수
	 * @countOthers lottos 중 훼손되지 않았으면서 win_nums가 불일치하는 개수 ( count + countOthers + 0의 개수 = 6 )
	 * @countZeros lottos 중 0의 개수
	 * 
	 * 달성 가능 최고 순위 : 7 - (count + 0의개수) , 단 범위 지정
	 * 달성 가능 최저 순위 : 7 - (count)
	 */
	public static int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = new int[2];
		
		ArrayList<String> numbers = new ArrayList<>();
		for(int i=0; i<6; i++) {
			numbers.add(win_nums[i]+"");
		}
		
		int count = 0; 
		int countZeros = 0;
		for(int i=0; i<lottos.length; i++) {
			if(numbers.contains(lottos[i]+"")) {
				count++;
			} else if(lottos[i]==0) {
				countZeros++;
			}
		}
		
		if(count+countZeros<=1){
            answer[0] = 6;
        } else {
            answer[0] = 7-count-countZeros;
        }
        if(count<=1){
            answer[1] = 6;
        } else {
            answer[1] = 7-count;
        }
	        
        return answer;
    }

}
