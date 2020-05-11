package study0414;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class SpeedEx {

	
	public static void main(String[] args) throws Exception {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int[][] arr = new int[a][2];
		
		for(int i=0; i<a; i++) {
			int j = 0;
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			while(st.hasMoreTokens()) {
				
				arr[i][j++] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int[] r : arr) {
			System.out.println("r[0] : " + r[0] + ", r[1] : " + r[1]);
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
		
			@Override
			public int compare(int[] ato, int[] saki) {
				
				return 0;
				
			}
		});
	}
}
