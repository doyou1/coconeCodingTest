package cocone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DynamicProgramming6 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		int[] arr = new int[301];
		int[] dp = new int[301];
				
		for(int i=0;i<n;i++) {
			arr[i] = Integer.valueOf(br.readLine());
		}
		
		//dp[n] = dp[i-2] + arr[i]
		//dp[n] = dp[i-3] + arr[i-1] + arr[i]
		dp[0] = arr[0];
		dp[1] = max(arr[0] + arr[1], arr[1]);
		dp[2] = max(arr[0] + arr[2], arr[1] + arr[2]);
		
		for(int i=3;i<n;i++) {
			dp[i] = max(dp[i-2] + arr[i], dp[i-3] + arr[i-1] + arr[i]);
		}
				
		System.out.println(dp[n-1]);
	}	
	
	
	static int max (int a, int b) {
		return a > b ? a : b;
	}
	
}
