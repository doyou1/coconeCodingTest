package cocone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GreedTest5 {


	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int length = Integer.valueOf(br.readLine());
		
		Integer[] ropes = new Integer[length];

		for(int i=0; i<length;i++) {
			ropes[i] = Integer.valueOf(br.readLine());
		}
		
		Arrays.sort(ropes);
	
		List<Integer> temp = Arrays.asList(ropes);
		Collections.reverse(temp);
		ropes = temp.toArray(ropes);
		
		int max = 0;
		
		for(int i=0;i<ropes.length;i++) {
			int low = ropes[i];
			
			int x = low * (i+1);
			
			if(max < x) {
				max = x;
			}
		}
		
		System.out.println(max);
		
	}
	
	
}
