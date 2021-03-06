package cocone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DynamicProgramming5_1 {
		
	static int N;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.valueOf(br.readLine());
		
		
		int[][] arr = new int[1000][3];

		
		int[][] dp = new int[1000][3];
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			arr[i][0] = Integer.valueOf(st.nextToken());
			arr[i][1] = Integer.valueOf(st.nextToken());
			arr[i][2] = Integer.valueOf(st.nextToken());
		}
		
		dp[0][0] = arr[0][0];
		dp[0][1] = arr[0][1];
		dp[0][2] = arr[0][2];
		
		for(int i=1; i<N; i++) {
			dp[i][0] = min(dp[i-1][1], dp[i-1][2]) + arr[i][0];
			dp[i][1] = min(dp[i-1][0], dp[i-1][2]) + arr[i][1];
			dp[i][2] = min(dp[i-1][0], dp[i-1][1]) + arr[i][2];
		}
		
		int result = Integer.MAX_VALUE;
		
		for(int i=0; i < 3; i++) {
			if(dp[N-1][i] < result) {
				result = dp[N-1][i];
			}
		}
		
		System.out.println(result);
	}	
	
	static int min(int a, int b) {
		return a < b ? a : b;
	}
	
	
}
