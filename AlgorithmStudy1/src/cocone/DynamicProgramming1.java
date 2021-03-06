package cocone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DynamicProgramming1 {

	static int count;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.valueOf(br.readLine());
		count = X;
		dfs(X, 0);
		System.out.println(count);
	}
	
	static void dfs(int X, int cnt) {
		if(X <= 1) {
			if(X == 1 && count > cnt) {
				count = cnt;				
			}		
			return;
		}
		
		if(X % 3 == 0) {
			dfs(X/3,cnt+1);			
		}
		else if(X % 2 == 0) {
			dfs(X/2,cnt+1);			
		}
			dfs(X-1,cnt+1);			
		


	}
}
