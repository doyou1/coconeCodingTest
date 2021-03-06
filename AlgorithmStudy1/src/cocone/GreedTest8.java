package cocone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GreedTest8 {


	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String input = br.readLine();
		
		int arrC = 0;
		String[] arr = new String[51];
		int prev = 0;
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i) == '+' || input.charAt(i) == '-') {
				arr[arrC++] = input.substring(prev, i);
				arr[arrC++] = input.substring(i,i+1);
				prev = i + 1;
			}
		}
		
		arr[arrC] = input.substring(prev);

		int result = Integer.valueOf(arr[0]);

		for(int i=1; i<arrC+1;i++) {
			String what = arr[i];
			
			if(what.equals("+")) {
				result += Integer.valueOf(arr[i+1]);
			}else if(what.equals("-")) {
				int temp = 0;
				for(int j=i+1;j<=arrC;j++) {
					i = j-1;
					if(!arr[j].equals("-") && !arr[j].equals("+")) {
						temp += Integer.valueOf(arr[j]);
						continue;
					}else if(arr[j].equals("-")) {
						
						break;
					}
				}

				result = result - temp;

			}

		}
		

		System.out.println(result);
	}
}