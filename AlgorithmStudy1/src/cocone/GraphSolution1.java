package cocone;

import java.util.ArrayList;
import java.util.LinkedList;

public class GraphSolution1 {

	public static void main(String[] args) {
		int n = 6;
		int[][] edge = {{3,6},{4,3},{3,2},{1,3},{1,2},{2,4},{5,2}};
		
		GraphSolution1 s1 = new GraphSolution1();
		int answer = s1.solution(n, edge);
		System.out.println("answer : " + answer);
	}
	
	public int solution(int n, int[][] edge) {
		int answer = 0;
		
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		
		for(int i = 0; i < edge.length ; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		for(int[] v : edge) {
			graph.get(v[0]).add(v[1]);
			graph.get(v[1]).add(v[0]);
		}
		
		int[] count = new int[n+1];
		boolean[] visited = new boolean[n+1];
		LinkedList<Integer> queue = new LinkedList<>();
		queue.add(1);
		
		visited[0]=visited[1]=true;
		int now;
		while(!queue.isEmpty()) {
			now=queue.poll();
			for(int v : graph.get(now)) {
				if(visited[v] == false) {
					count[v] = count[now] + 1;
					visited[v] = true;
					queue.add(v);
				}
			}
		}
		
		int max = 0;
		for(int cnt : count) {
			if(max < cnt) {
				max = cnt;
				answer = 1;
			} else if(max == cnt) {
				answer++;
			}
		}
		
		return answer;
	}	
}
