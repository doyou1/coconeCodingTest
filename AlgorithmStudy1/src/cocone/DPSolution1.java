package cocone;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class DPSolution1 {
	
	public static void main(String[] args) {
		DPSolution1 s1 = new DPSolution1();
		
		int N = 5;
		int number = 12;
		
		int answer = s1.solution(N, number);
		System.out.println(answer);
	}
	
	static int N_glb;
	TreeSet<Integer>[] dynamic;
	
	public TreeSet<Integer> solve(int n) {

		if(
			(dynamic[n] != null) 
			&&
			!(dynamic[n].isEmpty())) {
			
			return dynamic[n];
		}
		
		int num = 0;
		for(int i=0;i<n;i++) {
			num = 10 * num + N_glb;
		}

		TreeSet<Integer> temp = new TreeSet<>();
		temp.add(num);
		
		for(int i=1; i<n; i++) {
			int j = n-i;
			TreeSet<Integer> from = solve(i);
			TreeSet<Integer> to = solve(j);
			
			for(int n1 : from) {
				for(int n2 : to) {
					temp.add(n1 + n2);
					temp.add(n1 - n2);
					temp.add(n1 * n2);
					if(n2 != 0) {
						temp.add(n1 / n2);
					}
				}
			}
		}
		
		return dynamic[n] = temp;
	}
	
	public int solution(int N, int number) {
		
		int answer = 0;
		N_glb = N;
		
		dynamic = new TreeSet[10];
		
		for(int i=1; i<=8; i++) {
			solve(i);
			if(dynamic[i].contains(number)) {
				return i;
			}
		}
		
		return answer;
	}
	
	
}
