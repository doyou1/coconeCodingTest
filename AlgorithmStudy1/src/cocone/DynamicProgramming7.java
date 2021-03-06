package cocone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DynamicProgramming7 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		
		int[][] arr = new int[n][n];
		int[][] dp = new int[n][n];
		
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int cnt=0;
			while(st.hasMoreTokens()) {
				arr[i][cnt++] = Integer.valueOf(st.nextToken());
			}
		}
		
		dp[0][0] = arr[0][0];
		
		for(int i=1;i<n;i++) {
			dp[i][0] = dp[i-1][0] + arr[i][0];
			for(int j=1;j<=i;j++) {
				dp[i][j] = max(dp[i-1][j], dp[i-1][j-1]) + arr[i][j]; 
			}

		}
		
		int result = 0;
		for(int[] d : dp) {
			for(int temp : d) {
				if(result < temp) {
					result = temp;
				}
			}
		}
		System.out.println(result);
	}	

	static int max(int a, int b) {
		return a > b ? a : b;
	}
}
