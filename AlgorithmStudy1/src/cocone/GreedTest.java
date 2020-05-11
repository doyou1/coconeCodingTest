package cocone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class GreedTest {

/*

 */
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int length = Integer.valueOf(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[length];
		int cnt = 0;
		while(st.hasMoreTokens()) {
			arr[cnt++] = Integer.valueOf(st.nextToken());
		}
				
		Arrays.sort(arr);
		int sum = 0;
		
		for(int i=0; i<length;i++) {
			sum += arr[i] * (length-i);
		}
		
		System.out.println(sum);
		
	}
	
	
}
