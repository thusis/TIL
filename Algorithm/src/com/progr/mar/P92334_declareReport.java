package com.progr.mar;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P92334_declareReport {
	
	public static void main(String[] args) {
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;
//		String[] id_list = {"con", "ryan"};
//		String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
//		int k = 3;
		
		int[] answer = solution(id_list, report, k);
		for(int i=0; i<answer.length; i++) {
			System.out.print(answer[i]+" ");
		}
	}
	
    public static int[] solution(String[] id_list, String[] report, int k) {
    	//각 유저별로 처리 결과 메일을 받은 횟수
        int[] answer = new int[id_list.length]; 
        
        /**
         * 유저별로 필요한 정보
         * 아이디 : 유저가 신고한 아이디 / 신고당한 횟수 / 정지된 아이디
         * 
         * 헷갈리긴 하는데, id_list.length * report.length 만큼의 탐색은 거의 불가피함
         * 둘 중 뭘 기준으로 하든 일단 탐색 해야함
         * id_list 를 기준으로 가보자
         * 
         * ----try2 중복 신고 불가 옵션 넣기
         * 햔 사람이 동일 유저 여러번 신고할 수 없게하려면 유저별 신고 리스트(..)를 관리해야 함....
         * 이 아니고!!! report 를 Set에 넣고 한 번 솎자!
         * 
         */
        
        Set<String> set = new HashSet<String>(Arrays.asList(report));
        String[] report1 = set.toArray(new String[0]);
        
        // 1 각 유저별로 [신고한 아이디 리스트]와 [신고"당한" 횟수] 구하기
        int[] declaredCount = new int[id_list.length];

        for(int i=0; i<id_list.length; i++) {
        	String userId = id_list[i];
        	int count=0;
        	
        	for(int j=0; j<report1.length; j++) {
        		String declared = report1[j].split(" ")[1];
        		
        		if(userId.equals(declared)) {
        			count++;
        		}
        		
        		if(count==k) { break; }
        	}
        	
        	declaredCount[i] = count; //각 유저별로 declaredCount[i] == k 이면 정지됨
        	System.out.println(userId+"의 신고당한 횟수:"+count);
        }
        
        // 2 각 유저별로 회신 받을 횟수 결정
        /**
         * (1)내가 신고했는데
         * (2)신고한 유저의 이름과 일치하는 id_list 의 위치만큼의 인덱스를
         * (3)declaredCount에 대입했을 때 k 이면
         * 회신받을 count 상승
         */
        
        for(int i=0; i<id_list.length; i++) {
        	
        	String userId = id_list[i];
        	int count=0;
        	
        	for(int j=0; j<report1.length; j++) {
        		if(userId.equals(report1[j].split(" ")[0])) {
        			
        			if(declaredCount[Arrays.asList(id_list).indexOf(report1[j].split(" ")[1])]==k) {
        				count++;
        			};
        		}
        	}
        	
        	answer[i] = count;
        }
        
        return answer;
    }

}
