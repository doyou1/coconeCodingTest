package cocone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class GreedTest12 {
	static int k;
	static String[] arr;
	static boolean[] visited;
	static ArrayList<String> list;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		k = Integer.valueOf(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		arr = new String[k];
		for(int i=0;i<k;i++) {
			arr[i] = st.nextToken();
		}
		visited = new boolean[10];
		list = new ArrayList<>();
		
		for(int i=0;i<10;i++) {
			visited[i] = true;
			solve(0,i,i+"");
		}
		
		System.out.println(list);	
	}
	
	public static void solve(int cnt, int left, String t) {
		if(cnt == k) {
			list.add(t);
			visited[left] = false;
			return;
		}
		
		for(int i=0;i<10;i++) {
			//방문 판단
			if(visited[i]) continue;
			if(left==i) continue;
			//이전 수량 부호 판단
			if(arr[cnt].equals(">")) {
				if(left < i) {
					continue;
				}
			}else if(left > i) continue;
			visited[i] = true;
			solve(cnt+1,i,t+i);
		}
		visited[left] = false;
	}
	
}