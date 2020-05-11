package cocone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DynamicProgramming4_1 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Integer.valueOf(br.readLine());
		
		long[] arr= new long[((int) N + 1) % 10007];

		System.out.println(dp(arr,N % 10007));
	}	
	
	static long dp(long[] arr, long n) {
		arr[1] = 1;
		arr[2] = 2;
		for(int i=3;i<=n;i++) {
			arr[i] = (arr[i-1] + arr[i-2]) % 10007;
		}
		
		return arr[(int) n];
	}
}
