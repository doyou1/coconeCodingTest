package study0414;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Solution2 {
/*
 * 문제 설명
숫자 야구 게임이란 2명이 서로가 생각한 숫자를 맞추는 게임입니다. 게임해보기

각자 서로 다른 1~9까지 3자리 임의의 숫자를 정한 뒤 서로에게 3자리의 숫자를 불러서 결과를 확인합니다. 그리고 그 결과를 토대로 상대가 정한 숫자를 예상한 뒤 맞힙니다.

* 숫자는 맞지만, 위치가 틀렸을 때는 볼
* 숫자와 위치가 모두 맞을 때는 스트라이크
* 숫자와 위치가 모두 틀렸을 때는 아웃
예를 들어, 아래의 경우가 있으면

A : 123
B : 1스트라이크 1볼.
A : 356
B : 1스트라이크 0볼.
A : 327
B : 2스트라이크 0볼.
A : 489
B : 0스트라이크 1볼.
이때 가능한 답은 324와 328 두 가지입니다.

질문한 세 자리의 수, 스트라이크의 수, 볼의 수를 담은 2차원 배열 baseball이 매개변수로 주어질 때, 가능한 답의 개수를 return 하도록 solution 함수를 작성해주세요.

제한사항
질문의 수는 1 이상 100 이하의 자연수입니다.
baseball의 각 행은 [세 자리의 수, 스트라이크의 수, 볼의 수] 를 담고 있습니다.
입출력 예
baseball	return
[[123, 1, 1], [356, 1, 0], [327, 2, 0], [489, 0, 1]]	2
입출력 예 설명
문제에 나온 예와 같습니다.

출처
 * */
	
	
	public static void main(String[] args) {
		
		ArrayList<String> numbers = new ArrayList<>();

		//111~999까지의 데이터셋 생성
		for(int i=0;i<10;i++) {
			String si = String.valueOf(i);
			for(int j=0;j<10;j++) {
				String sj = String.valueOf(j);
				for(int k=0;k<10;k++) {
					String sk = String.valueOf(k);
					
					String s = si+sj+sk;
					numbers.add(s);
				}
			}
		}
		
		//input testdata 생성
		int length = 4;
		int[] a = {123,1,1};
		int[] b = {356,1,0};
		int[] c = {327,2,0};
		int[] d = {489,0,1};
		int[][] baseballs = new int[length][3];
		baseballs[0] = a;
		baseballs[1] = b;
		baseballs[2] = c;
		baseballs[3] = d;
		
		//조건이 충족하는 값을 담기 위한 Collection
		ArrayList<String> result = new ArrayList<>();
		
		Solution2 s2 = new Solution2();
		
		//000~999의 데이터셋 완전조사
		for(int n = 0; n<numbers.size(); n++) {
			//특정 데이터
			String num = numbers.get(n);
			
			//Strike, Ball이 전부 충족하는가를 체크하기 위한 변수
			int check = 0;
			for(int i=0; i<baseballs.length; i++) {
				
				//특정 변수 1
				String baseball = baseballs[i][0] + "";
				if((baseballs[i][0] + "").length() != 3) {
					int size = baseball.length();
					
					if(size == 0) {
						baseball = "000";
					}else if(size == 1) {
						baseball = "00" + baseball;
					}else if(size == 2) {
						baseball = "0" + baseball;
					}
				}

				System.out.println("num : "+num + " baseball : " + baseball);
				int[] arr = s2.count(num, baseball);
				
				System.out.println("strike : " + arr[0] + "ball : " + arr[1]);
				
				int strike = arr[0];
				int ball = arr[1] - strike;
				
				if(strike == baseballs[i][1] && ball == baseballs[i][2]) {
//					result.add(baseball);
					check++;
				}
				System.out.println("======================");
				
				if(check == baseballs.length) {
					result.add(baseball);
				}
			}
			
			
		}
		
		System.out.println(result.size());
			
	}
	
	
	public int[] count(String num,String baseball) {
		

		int[] arr = {0,0};
		
		for(int i=0;i<3;i++) {
			if(num.charAt(i) == baseball.charAt(i)) {
				arr[0]++;
			}
					
			if(baseball.contains(num.charAt(i) + "")) {
				arr[1]++;
			}
			
		}
		
		
		
		return arr;
	}
	
	/*
	public int solution(int[][] baseball) {
		
		ArrayList<Integer> strikes = new ArrayList<>();
		ArrayList<Integer> balls = new ArrayList<>();
		
		
		for(int i=0;i<baseball.length;i++) {
			int[] temp = baseball[i];
			int num = temp[0];
			String[] strTemp = null;
			strTemp = Integer.toString(num).split("");
			
			//오름차순 정렬
			Arrays.sort(strTemp, new Comparator<String>(){
				@Override
				public int compare(String start, String end) {
					
					return start.compareTo(end);
				}
			});
			
//			String str = strTemp[0] + strTemp[1] + strTemp[2];
			
//			int lowestNum = Integer.parseInt(str);
			
			if(temp[1] == 0) {
				//strikes가 0
				
			}else if(temp[1] == 1) {
				//strikes가 1
				
				//만약 index1
			}else if(temp[1] == 2) {
				//strikes가 2
			}else if(temp[1] == 3) {
				return 1;
			}
			
			
			
		}
		
		
		int answer = 0;
		
		return answer;
	}
	
	*/
}
