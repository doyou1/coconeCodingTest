package cocone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DynamicProgramming9 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		
		int[] arr = new int[10003];
		int result = 0;
		for(int i = 3; i < n+3;i++) {
			arr[i] = Integer.valueOf(br.readLine());
		}
		int[] dp = new int[10003];
		
		for(int i=3;i<n+3;i++) {
			dp[i] = max(dp[i-3] + arr[i-1] + arr[i], dp[i-2]  + arr[i]) ;
			dp[i] = max(dp[i],dp[i-1]);
			result = max(dp[i],result);
		}
		System.out.println(result);
	}	
	
	static int max(int a, int b) {
		return a > b ? a : b;
	}

}
