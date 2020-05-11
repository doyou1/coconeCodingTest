package cocone;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class DPSolution2 {
	
	public static void main(String[] args) {
		DPSolution2 s1 = new DPSolution2();
		
		int N = 5;
		int number = 12;
		
		int answer = s1.solution(N, number);
		System.out.println(answer);
	}	
	
	static int answer = -1;
	
	public int solution(int N, int number) {
		
		
		dfs(N, number, 0 , 0);
		
		return answer;
	}
	
	public void dfs(int N, int number, int cnt, int prev) {
		
		//N의 카운트를 늘려가며 dfs로 수행함
		//그 값을 저장하고 그 값이 number와 동일한지 확인함
		int temp_N = N;
		if(cnt > 8) {
			answer = -1;
			return;
		}
		
		if(number == prev) {
			if(answer == -1 || answer > cnt) {
				answer = cnt;
			}
			return;
		}
		
		for(int i = 0; i < 8-cnt; i++) {
			dfs(N, number, cnt+i+1, prev-temp_N);
			dfs(N, number, cnt+i+1, prev+temp_N);
			dfs(N, number, cnt+i+1, prev*temp_N);
			dfs(N, number, cnt+i+1, prev/temp_N);
			
			temp_N = increaseNumber(temp_N, N);
		}
	}
	
	public int increaseNumber(int value, int N) {
		return value * 10 + N;
	}
}
