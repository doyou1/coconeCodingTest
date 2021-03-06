package cocone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DynamicProgramming8 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());

		//int[] arr = new int[n];
		long[] arr = new long[n];
		
		arr[0] = 1;
		arr[1] = 1;

		
		for(int i=2; i<n;i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		System.out.println(n-1);
		System.out.println(arr[n-3]);
		System.out.println(arr[n-2]);
		
		System.out.println(arr[n-1]);
		//System.out.println(arr[n]);
	}	

}
