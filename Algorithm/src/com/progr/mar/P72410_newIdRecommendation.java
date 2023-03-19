package com.progr.mar;

public class P72410_newIdRecommendation {
	//https://school.programmers.co.kr/learn/courses/30/lessons/72410
	public static void main(String[] args) {
		
	}
	
	public static String solution(String new_id) {
		
		String editingId = "";
		/**
		 * 1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
		 * 2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
		 * 3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
		 * 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
		 * 5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
		 * 6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
		 *      만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
		 * 7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
		 */

		editingId = new_id.toLowerCase();
		/**
		 * 2
		 * a-z 0-9 \- \_ \. 가 아니면 "" 로 제외
		 * "[^0-9a-z\\-_.]"
		 */
		editingId = editingId.replaceAll("[^0-9a-z\\-_.]", "");
		
		/**
		 * 3
		 * \\. (마침표)
		 * {2,} 2회 이상
		 */
		editingId = editingId.replaceAll("\\.{2,}", ".");
		
		/**
		 * 4
		 * ^ : 문자의 시작
		 * ^[.] : 문자열이 마침표로 시작하는 것
		 * | : or
		 * [.]$ : 마침표로 끝나는 것
		 */
		editingId = editingId.replaceAll("^[.]|[,]$", "");
		
		/**
		 * 5
		 * 
		 */
		if(editingId.equals("")) {
			editingId = "a";
		}
		
		/**
		 * 6
		 * 
		 */
		if(editingId.length()>=16) {
			editingId = editingId.substring(0,15);
		}
		editingId = editingId.replaceAll("[.]$", "");
		
		String temp = editingId.charAt(editingId.length()-1) + "";
		while(editingId.length()<=2) {
			editingId = editingId + temp;
		}
		
		return editingId;
	}
}
