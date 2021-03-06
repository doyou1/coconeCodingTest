package cocone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DynamicProgramming2 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.valueOf(br.readLine());
		
		int[] tArr = new int[t]; 
		for(int i=0;i<t;i++) {
			tArr[i] = Integer.valueOf(br.readLine());
		}
		
		int[] arr = new int[11];
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 4;

		for(int T : tArr) {
			for(int i=4;i<=T;i++) {				
				arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
			}
			System.out.println(arr[T]);
		}
		

	}
	
}
