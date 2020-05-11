package study0413;

import java.util.ArrayList;

public class Solution3 {
/*
 * 하노이 탑(Tower of Hanoi)은 퍼즐의 일종입니다. 세 개의 기둥과 이 기동에 꽂을 수 있는 크기가 다양한 원판들이 있고, 퍼즐을 시작하기 전에는 한 기둥에 원판들이 작은 것이 위에 있도록 순서대로 쌓여 있습니다. 게임의 목적은 다음 두 가지 조건을 만족시키면서, 한 기둥에 꽂힌 원판들을 그 순서 그대로 다른 기둥으로 옮겨서 다시 쌓는 것입니다.

한 번에 하나의 원판만 옮길 수 있습니다.
큰 원판이 작은 원판 위에 있어서는 안됩니다.
하노이 탑의 세 개의 기둥을 왼쪽 부터 1번, 2번, 3번이라고 하겠습니다. 1번에는 n개의 원판이 있고 이 n개의 원판을 3번 원판으로 최소 횟수로 옮기려고 합니다.

1번 기둥에 있는 원판의 개수 n이 매개변수로 주어질 때, n개의 원판을 3번 원판으로 최소로 옮기는 방법을 return하는 solution를 완성해주세요.

제한사항
n은 15이하의 자연수 입니다.
 * */
	
	ArrayList<int[][]> list = new ArrayList<>();

	public static void main(String[] args) {
		Solution3 s3 = new Solution3();
		
		int n = 8;
		int[][] answer =s3.solution(n);
		
		
	}
	
	 public int[][] solution(int n) {

		 int[][] answer = {};
		 ArrayList<int[]> list = new ArrayList<int[]>();

		 
		 hanoi(n,1,3,2,list);
		 
		 
		 answer = list.toArray(new int[list.size()][]);
		 return answer;
	 }
	 
	 //원판의 갯수, 시작점, 도착점, 경유점, 이동을 했을때 위치를 담는
	 public void hanoi(int num, int from, int to, int other, ArrayList<int[]> list) {
		 

		 //from에서 other로
		 //종료조건
		 if(num == 1) {						  
			 list.add(new int[]{from,to});
			 System.out.println(from + "->" + to);
		 }
		 
		 else {
			
			//맨 아래에 있는 원판 빼고, 보조기둥으로 옮기기
			hanoi(num -1, from, other, to,list);
			//맨 아래에 있는 원판을 목표기둥으로 옮기기
			hanoi(1, from, to,other,list);//가장 밑판
			//5개를 보조로 
			hanoi(num -1, other, to, from,list);		 
		 }
	 }
}