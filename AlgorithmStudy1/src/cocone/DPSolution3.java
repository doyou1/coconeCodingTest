package cocone;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class DPSolution3 {
	
	//깊이우선탐색 : 순서가 있다. 
	//문제를 쪼개고
	public static void main(String[] args) {
		
		DPSolution3 s1 = new DPSolution3();
		
		int N = 10;
		
		long answer = s1.solution(N);
		System.out.println(answer);
	}
		
	public long solution(int N) {	
		long answer = 0;
		
		long[] arr = new long[N+1];
		
		arr[1] = 1;
		
		for(int i=2; i < arr.length; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		answer = arr[N] * 4 + arr[N-1] * 2;
			
		return answer;
	}
}