package cocone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DynamicProgramming3_1 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.valueOf(br.readLine());
		
		int[] tArr = new int[t];
		for(int i=0;i<t;i++) {
			tArr[i] = Integer.valueOf(br.readLine());
		}

		int[][] arr = new int[41][2];
		arr[0][0] = 1;
		arr[1][1] = 1;

		for(int i=2;i<41;i++) {
			for(int j=0;j<2;j++) {
				arr[i][j] = arr[i-1][j] + arr[i-2][j];
				System.out.println(
						"arr["+i+"]["+j+"] = arr["+(i-1)+"]["+j+"] + arr["+(i-2)+"]["+j+"]");
			}
		}
		System.out.println("-------------------------");
		
		for(int T : tArr) {
			System.out.println(arr[T][0] + " " + arr[T][1]);
		}
	}	
}
