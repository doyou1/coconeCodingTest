package study0414;

import java.util.ArrayList;

public class Solution2_2 {
//405
//123

	//159
	public static void main(String[] args) {
		
		/*
		 * 탈것 클래스 . 속도, 탈것의무게, 탈것의 정보, 탈것의 가치
		 * get set 메소드
		 * 
		 * 탈것의 가치(속드 * 무게 /가격) - 메소드
		 * */
		
		//정답이 152
		//159
		//S : 1 B : 1 // 356 : S : 1 B : 0
		int[][] baseball = {{123, 1, 1}, {356, 1, 0}, {327, 2, 0}, {489, 0, 1}};
		int[][] baseball1 = {{123, 0, 1}, {456, 1, 0}, {789, 0, 1}, {147, 0, 1},
				{159,0,0},{276,0,0}};
		int[][] baseball2 = {{123, 2, 0}, {456, 0, 0}, {789, 0, 1}, {125, 1, 0},
				{173,1,0},{823,2,0}};
		int[][] baseball3 = {{123, 2, 0}, {456, 0, 0}, {789, 0, 1}};
		int[][] baseball4 = {{123, 0, 0}};
		int[][] baseball5 = {{123, 0, 1},{456,0,0},{789,1,1}};
		
		
		
		Solution2_2 s2 = new Solution2_2();
		
		int result = s2.solution(baseball5);
		
		System.out.println(result);
	//	System.out.println("result : " + result);
	}
	
	
	public int solution(int[][] baseball) {
	        
		ArrayList<String> numbers = new ArrayList<>();
		
		//123~987까지의 데이터셋 생성(아참! 0이 들어가거나 중복되는 값이 있어선 안됨)
		for(int i=1;i<10;i++) {
			String si = String.valueOf(i);
			for(int j=1;j<10;j++) {
				String sj = String.valueOf(j);
				for(int k=1;k<10;k++) {
					String sk = String.valueOf(k);
					
					if(si.equals(sj) || si.equals(sk) || sj.equals(sk)) {
						continue;
					}
					
					String s = si+sj+sk;
					numbers.add(s);
				}
			}
		}
		
		
		
		ArrayList<String> result = new ArrayList<>();
		
        //데이터셋 완전조사
		for(int n = 0; n<numbers.size(); n++) {
			//특정 데이터
			String num = numbers.get(n);
			
			//Strike, Ball이 전부 충족하는가를 체크하기 위한 변수
			int check = 0;
			
			for(int i=0; i<baseball.length; i++) {
				
				//특정 변수 1
				String bb = baseball[i][0] + "";
				
				//0이 들어가 있을까봐 한번 더 체크, 불필요
				if(bb.length() != 3) {
					int size = bb.length();
					if(size == 0) {
						bb = "000";
					}else if(size == 1) {
						bb = "00" + bb;
					}else if(size == 2) {
						bb = "0" + bb;
					}
                }
				
                int strike = 0;
				int ball = 0;
				
				for(int j=0;j<3;j++) {

					//num = 126			bb = 356  
					if(num.charAt(j) == bb.charAt(j)) {
						strike++;
					}
						//strike 1번이고 볼 2
					if(bb.contains(num.charAt(j) + "")) {
						ball++;
					}
					
				}

				ball = ball - strike;
				

				if(strike == baseball[i][1] && ball == baseball[i][2]) {
					check++;
				}
				
				//이 4가지 조건이 모두 층족했는지
				//{123, 1, 1}, {356, 1, 0}, {327, 2, 0}, {489, 0, 1}
				//123,1,1 
				
				
			}
			
			if(check == baseball.length) {
				result.add(num);
			}
		}	
		
		System.out.println(result);
		int answer = result.size();
		return answer;
	}	
}