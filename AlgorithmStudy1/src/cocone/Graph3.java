package cocone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Graph3 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.valueOf(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		ArrayList<Integer>[] listArr = (ArrayList<Integer>[]) new ArrayList[N];
		boolean[] checks = new boolean[N];
		int[] arr = new int[N];
		
		for(int i=0;i<N;i++) {
			listArr[i] = new ArrayList<Integer>();
		}
		
		for(int i=0;i<N;i++) {
			arr[i] = Integer.valueOf(st.nextToken());
		}
		
		int root = 0;
		for(int i=0;i<N;i++) {
			if(arr[i] == -1) {
				root = i;
				continue;
			}
			
			listArr[arr[i]].add(i);
			listArr[i].add(arr[i]);
		}
		
		int remove = Integer.valueOf(br.readLine());
		
		Queue<Integer> queue= new LinkedList<Integer>();
		checks[remove] = true;
		while(!queue.isEmpty()) {
			remove = queue.poll();
			for(int a: listArr[remove]) {
				if(!checks[a] && arr[remove] != a) {
					queue.add(a);
					checks[a] = true;
				}
			}
		}
		
		int cnt = 0;
		if(!checks[root]) {
			queue.add(root);
			checks[root] = true;
			while(!queue.isEmpty()) {
				int node = queue.poll();
				boolean flag = false;
				for(int a : listArr[node]) {
					if(!checks[a] && arr[node] != a) {
						flag = true;
						queue.add(a);
						checks[a] = true;
					}
				}
				
				if(!flag) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}
