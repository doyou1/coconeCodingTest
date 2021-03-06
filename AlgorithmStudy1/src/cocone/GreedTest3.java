package cocone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class GreedTest3 {


	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.valueOf(br.readLine());

		int[][] arr = new int[count][2];
		for(int i = 0; i < count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = Integer.valueOf(st.nextToken());
			arr[i][1] = Integer.valueOf(st.nextToken());
		}
		
		
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] a1, int[] a2) {
								
				if(a1[0] == a2[0]) {
					return a1[1] > a2[1] ? 1 : -1; 
				}else if(a1[1] == a2[1]) {
					return a1[0] > a2[0] ? 1 : -1;
				}
				
				return a1[1] > a2[1] ? 1 : -1;
			}
		} );
		
		int cnt = 0;
		int end = 0;
		
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i][0] >= end) {
				cnt++;
				end = arr[i][1];
			}
		}
		
		System.out.println(cnt);
	}
	
	
}
