package cocone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class GreedTest6_cantsolve {


	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String N = br.readLine();
		
		int sum = 0;
		int[] counts = new int[10];
		for(int i=0; i<N.length(); i++) {
			int num = Integer.valueOf(N.charAt(i)+"");
			counts[num] += 1;
			sum += num;
		}
		
		if(sum%3!=0 || !N.contains("0")) {
			System.out.println(-1);
		}else {

			StringBuilder sb = new StringBuilder();
			for(int i=9;i>=0;i--) {
				while(counts[i] > 0) {
					sb.append(i);
					counts[i] -= 1;
				}
			}
			System.out.println(sb.toString());
		}
	}
}