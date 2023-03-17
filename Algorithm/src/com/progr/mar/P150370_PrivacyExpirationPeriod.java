package com.progr.mar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class P150370_PrivacyExpirationPeriod {
//https://school.programmers.co.kr/learn/courses/30/lessons/150370
	public static void main(String[] args) {
		String today = "2022.05.19";
		String[] terms = {"A 6", "B 12", "C 3"};
		String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};

		int[] answer = solution(today, terms, privacies);
		for(int i=0; i<answer.length; i++) {
			System.out.print(answer[i]+" ");
		}
		
	}
	
	/**
	 * 모든 달은 28일까지 있다고 가정합니다. => Date 클래스 사용할 수 없당
	 * 2022-0518
	 * 
	 * @param today 오늘 날짜 | YYYY.MM.DD
	 * @param terms 약관의 유효기간 | 약관종류(A~Z) 유효기간(1~100)
	 * @param privacies 수집된 개인정보의 정보 | 날짜(YYYY.MM.DD) 약관종류(A~Z)
	 * 
	 * @return answer 파기해야 할 개인정보
	 */
	public static int[] solution(String today, String[] terms, String[] privacies) { //정확도 5/100
		
		HashMap<String,Integer> todayMap = new HashMap<>();
		todayMap.put("year", Integer.parseInt(today.split("\\.")[0]));
		todayMap.put("month", Integer.parseInt(today.split("\\.")[1]));
		todayMap.put("date", Integer.parseInt(today.split("\\.")[2]));

		ArrayList<Integer> tempAnswer = new ArrayList<>();
		
        for(int i=0; i<privacies.length; i++) {
        	String collectedDate = privacies[i].split(" ")[0];
        	String termType = privacies[i].split(" ")[1];
        	
        	HashMap<String,Integer> expirationDate = new HashMap<>();
        	
        	expirationDate.put("year", Integer.parseInt(collectedDate.split("\\.")[0]));
        	expirationDate.put("month", Integer.parseInt(collectedDate.split("\\.")[1]));
        	expirationDate.put("date", Integer.parseInt(collectedDate.split("\\.")[2])-1); //if 0이면 28반환

        	if(expirationDate.get("date")==0) {
        		expirationDate.put("date", 28);
        	}

        	for(int j=0; j<terms.length; j++) {
        		if(terms[j].split(" ")[0].equals(termType)) {
        			expirationDate.put("period", Integer.parseInt(terms[j].split(" ")[1]));
        		}
        	}
        	
        	expirationDate.put("year", expirationDate.get("year") + ((expirationDate.get("month") + expirationDate.get("period")) / 12)) ; 
        	expirationDate.put("month", (expirationDate.get("month") + expirationDate.get("period")) % 12);
        	
        	/*
        	String todayStr = todayMap.get("year")+""+todayMap.get("month")+""+todayMap.get("date");
        	String expStr = expirationDate.get("year")+""+expirationDate.get("month")+""+expirationDate.get("date");
        	
        	System.out.println(todayStr);
        	System.out.println(expStr);
        	
        	if(Integer.parseInt(todayStr)>Integer.parseInt(expStr)) {
        		tempAnswer.add(i+1);
        	}
        	*/
        	
        	//==비교 시작==
        	if(todayMap.get("year")>expirationDate.get("year")) {
        		tempAnswer.add(i+1);
        		break;
        	} else if( (todayMap.get("year")==expirationDate.get("year")) 
        			&& (todayMap.get("month")>expirationDate.get("month")) ) {
        		tempAnswer.add(i+1);
        		break;
        	} else if( (todayMap.get("year")==expirationDate.get("year")) 
        			&& (todayMap.get("month")==expirationDate.get("month")) 
        			&& (todayMap.get("date")>expirationDate.get("date")) ) {
        		tempAnswer.add(i+1);
        		break;
        	} 
        	
//        	if(todayMap.get("year")<expirationDate.get("year")) {
//        		break;
//        	} else if( (todayMap.get("year")==expirationDate.get("year")) 
//        			&& (todayMap.get("month")<expirationDate.get("month")) ) {
//        		break;
//        	} else if( (todayMap.get("year")==expirationDate.get("year")) 
//        			&& (todayMap.get("month")==expirationDate.get("month")) 
//        			&& (todayMap.get("date")<expirationDate.get("date")) ) {
//        		break;
//        	} else {
//        		System.out.println( todayMap.get("year")+""+todayMap.get("month")+""+todayMap.get("date")+" vs. "+expirationDate.get("year")+""+expirationDate.get("month")+""+expirationDate.get("date")+"가 추가됨");
//        		tempAnswer.add(i+1);
//        	}
        }
        int[] answer = tempAnswer.stream().mapToInt(Integer::intValue).toArray();
		return answer;
	}
	
    public static int[] solution1(String today, String[] terms, String[] privacies) { //정확도 45/100
        
        String tempAnswer = "";
        
        today = "" + today.charAt(2) + today.charAt(3) + 
        		today.charAt(5) + today.charAt(6) + today.charAt(8) + today.charAt(9);
        
        for(int i=0; i<privacies.length; i++) {
        	String collectedDate = privacies[i].split(" ")[0];
        	String termType = privacies[i].split(" ")[1];
        	
        	int expirationPeriod = 0;
        	for(int j=0; j<terms.length; j++) {
        		if(terms[j].split(" ")[0].equals(termType)) {
        			expirationPeriod = (Integer.parseInt(terms[j].split(" ")[1]));
        		}
        	}
        	
        	System.out.println("expirationPeriod는 "+expirationPeriod);
        	
        	int tempYear = Integer.parseInt(""+collectedDate.charAt(2)+collectedDate.charAt(3));
        	int tempMonth = Integer.parseInt(""+collectedDate.charAt(5)+collectedDate.charAt(6));
        	int tempDate = Integer.parseInt(""+collectedDate.charAt(8)+collectedDate.charAt(9));
        	System.out.println(privacies[i]+"의 tempYear와 Month:"+tempYear+" "+tempMonth);
        	
        	int plusMonth = (tempMonth + expirationPeriod)%12;
        	int plusYear = (tempMonth + expirationPeriod)/12;
        	tempYear = tempYear + plusYear;
        	System.out.println(privacies[i]+"의 tempYear와 Month:"+tempYear+" "+plusMonth);
        	
        	String expirationDate = "";
        	if(tempYear<10) {
        		expirationDate = "0"+tempYear;
        	} else {
        		expirationDate = "" + tempYear;
        	}
        	
        	if(plusMonth<10) {
        		expirationDate = expirationDate + "0" + plusMonth ;
        	} else {
        		expirationDate = expirationDate + plusMonth;
        	}
        	
        	if(tempDate==1) {
        		expirationDate = expirationDate + "28";
        	} else if(tempDate<10) {
        		expirationDate = expirationDate + "0" + tempDate;
        	} else {
        		expirationDate = expirationDate + (tempDate-1);
        	}
        	
        	System.out.println("개인정보유효기간은 :"+expirationDate+" 오늘 날짜는 "+today);
        	
        	if(Integer.parseInt(expirationDate)<Integer.parseInt(today)) {
        		tempAnswer = tempAnswer + (i+1)+" ";
        	}
        	System.out.println("==========================================");
        }
        
        int[] answer = Arrays.stream(tempAnswer.split(" ")).mapToInt(Integer::parseInt).toArray();

        return answer;
    }

}
