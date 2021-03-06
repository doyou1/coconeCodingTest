package cocone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DynamicProgramming3 {
	
	static int count0;
	static int count1;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.valueOf(br.readLine());
		
		int[] tArr = new int[t];
		for(int i=0;i<t;i++) {
			tArr[i] = Integer.valueOf(br.readLine());
		}

		int[] arr = new int[41];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 1;
		
		for(int T : tArr) {
			count0 = 0;
			count1 = 0;
			dp(arr, T);
			System.out.println(count0 + " " + count1);
		}
		
	}
	
	static int dp(int[] arr, int T) {
		
		if(T == 1) {
			count1 = count1 + 1;
			return 1;
		}else if(T == 0) {
			count0 = count0 + 1;
			return 0;
		}

		if(arr[T-1] == 0 && arr[T-2] == 0) {
			return (arr[T-1] = dp(arr, T-1)) + (arr[T-2] = dp(arr, T-2));
		}
		
		return dp(arr, T-1) + dp(arr, T-2);
	}
	
}
