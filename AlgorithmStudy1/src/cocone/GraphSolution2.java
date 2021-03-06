package cocone;

import java.util.ArrayList;
import java.util.LinkedList;

public class GraphSolution2 {

	public static void main(String[] args) {
		int n = 5;
		int[][] results = {{4,3},{4,2},{3,2},{1,2},{2,5}};
		
		GraphSolution2 s2 = new GraphSolution2();
		s2.solution(n, results);
		
	}
	
	public int solution(int n, int[][] results) {
		int answer = 0;
		
		ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
		
		for(int i = 0; i <= results.length; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		for(int[] result : results) {
			graph.get(result[1]).add(result[0]);
		}
		
		for(int i = 0 ; i < graph.size() ; i++) {
			System.out.println(i + " " + graph.get(i));
		}
		return answer;
	}	
}
