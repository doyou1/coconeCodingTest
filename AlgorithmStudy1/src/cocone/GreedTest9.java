package cocone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Set;
import java.util.StringTokenizer;

public class GreedTest9 {


	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		String[] x = st.nextToken().split("");
		String[] y = st.nextToken().split("");
	
		//무조건 큰 값이 뒤로 오게
		if(x.length > y.length) {
			String[] temp = x;
			x = y;
			y = temp;
		}
		
		int result = y.length;
			
		int length = y.length - x.length;
		
		for(int i=0;i<=length;i++) {
			int temp = 0;
			for(int j=0;j<x.length;j++) {
				if(!x[j].equals(y[j+i])) {
					temp++;
				}
			}
			if(result > temp) {
				result = temp;
			}
		}
		
		System.out.println(result);
	}
	
}