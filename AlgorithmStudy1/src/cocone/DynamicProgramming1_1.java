package cocone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DynamicProgramming1_1 {

	static int[] arr;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.valueOf(br.readLine());
	
		arr = new int[X+1];
		System.out.println(dp(X));
	}
	
	static int dp(int X) {
		if(X == 1) {
			return 0;
		}
		if(arr[X] > 0) {
			return arr[X];
		}
		arr[X] = dp(X-1) + 1;
		if(X % 2 == 0) {
			int temp = dp(X / 2) + 1;
			if(arr[X] > temp) {
				arr[X] = temp;
			}
		}
		if(X % 3 == 0) {
			int temp = dp(X / 3) + 1;
			if(arr[X] > temp) {
				arr[X] = temp;
			}
		}
		return arr[X];
	}
}
