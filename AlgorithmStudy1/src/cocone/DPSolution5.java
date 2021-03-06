package cocone;

import java.util.ArrayList;

public class DPSolution5 {
	
	public static void main(String[] args) {
		DPSolution5 s1 = new DPSolution5();
		
		int m = 4;
		int n = 3;
		int[][] puddles = {{2,2}};
		
		int answer = s1.solution(m,n,puddles);
	}
		
	public int solution(int m,int n,int[][] puddles) {	
		int answer = 0;

		int[][] map = new int[m+1][n+1];
		
		map[1][1] = 1;
		for(int[] puddle : puddles) {
			map[puddle[0]][puddle[1]] = -1;
		}
		
		return answer;
	}
	
	
}
