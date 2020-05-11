package cocone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DynamicProgramming4_2 {
	static int[] arr;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		
		arr= new int[N+1];

		System.out.println(dp(N));
	}	
	
	static int dp(int n) {
		if(n == 0 || n == 1) return 1;
		if(arr[n] > 0) return arr[n];
		
		arr[n] = dp(n-1) + dp(n-2);
		arr[n] %= 10007;
		return arr[n];
	}
}
