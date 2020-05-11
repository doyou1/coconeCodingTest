package cocone;

import java.util.ArrayList;

public class DPSolution4 {
	
	public static void main(String[] args) {
		DPSolution4 s1 = new DPSolution4();
		
		int[][] triangle = {{7},{3,8},{8,1,0},{2,7,4,4},{4,5,2,6,5}};
		
		int answer = s1.solution(triangle);
	}
		
	public int solution(int[][] triangle) {	
		int answer = 0;
		
		for(int i=triangle.length-2;i>=0;i--) {
			for(int j=0;j<triangle[i].length;j++) {
				triangle[i][j] = triangle[i+1][j] > triangle[i+1][j+1] ? triangle[i][j] + triangle[i+1][j] : triangle[i][j]+ triangle[i+1][j+1];
			}
		}
		System.out.println(triangle[0][0]);
		return answer;
	}
	
	
	
	
}
