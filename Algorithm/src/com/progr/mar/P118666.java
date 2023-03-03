package com.progr.mar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P118666 {
	//카카오 인턴 - 성격 유형 검사하기 (80.0/100)
	/**
	 * 
	 * String[] survey 1차원 문자열 배열 
	 * int[] choices 검사자가 각 질문마다 선택한 선택지를 담은 1차원 정수 배열 
	 * 
	 * 비동의 <-> 동의
	 * 1 2 3 4 5 6 7
	 * --------------
	 * -3 -2 -1 0 1 2 3
	 */
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			String input = br.readLine().replaceAll("[\\[\"\\]\\s]","");
			String[] survey = input.split(",");
			input = br.readLine().replaceAll("[\\[\\]\\s]","");
			int[] choices = Arrays.stream(input.split(",")).mapToInt(Integer::parseInt).toArray();
			
			String answer = solution(survey, choices);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String solution(String[] survey, int[] choices) {
		String answer = "";
		
		//지표
		int caseRT = 0;
		int caseCF = 0;
		int caseJM = 0;
		int caseAN = 0;
		
		for(int i=0; i<survey.length;i++) {
			switch(survey[i]) {
			case "RT":
				caseRT = caseRT + ( choices[i] - 4 );
				break;
			case "TR":
				caseRT = caseRT - ( choices[i] - 4 );
				break;
				
			case "CF":
				caseCF = caseCF + ( choices[i] - 4 );
				break;
			case "FC":
				caseCF = caseCF - ( choices[i] - 4 );
				break;
				
			case "JM":
				caseJM = caseJM + ( choices[i] - 4 );
				break;
			case "MJ":
				caseJM = caseJM - ( choices[i] - 4 );
				break;

			case "AN":
				caseAN = caseAN + ( choices[i] - 4 );
				break;
			case "NA":
				caseAN = caseAN - ( choices[i] - 4 );
				break;
			}
		}

		/*RT3
		CF-1
		JM2
		AN0
		TCMA*/
		
		if(caseRT>=0) {
			answer = "T";
		} else {
			answer = "R";
		}
		
		if(caseCF<=0) {
			answer = answer + "C";
		} else {
			answer = answer + "F";
		}
		
		if(caseJM > 0) {
			answer = answer + "M";
		} else {
			answer = answer + "J";
		}
		
		if(caseAN <= 0){
			answer = answer + "A";
		} else {
			answer = answer + "N";
		}
		System.out.println(answer);
		return answer;
	}
	

}
