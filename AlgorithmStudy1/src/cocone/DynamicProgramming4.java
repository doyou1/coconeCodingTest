package cocone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DynamicProgramming4 {
	static int N;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.valueOf(br.readLine());
		
		int[][] arr= new int[N+1][2];

		System.out.println(dp(arr,N)%10007);
	}	
	
	static int dp(int[][] arr, int n) {
		if(n == 1 || n == 0) {
			return 1;
		}
		
		if(arr[n][0] > 0 && arr[n][1] > 0) {
			return ((arr[n][0] = dp(arr,n-1)) + (arr[n][1] = dp(arr,n-2))) % 10007;

		}

		return (dp(arr,n-1) + dp(arr,n-2)) % 10007;		

	}
}
