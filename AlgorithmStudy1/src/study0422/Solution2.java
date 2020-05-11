package study0422;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution2 {
/*
 * 5
3 4
1 1
1 -1
2 2
3 3
 * */
	
	public static void main(String[] args) {
		
		Solution2 s2 = new Solution2();
		
		
	}
	
	public void Solution() throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int length = Integer.valueOf(br.readLine());
		
		int[][] nums = new int[length][2];
		
		for(int i=0;i<nums.length;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.valueOf(st.nextToken());
			int b = Integer.valueOf(st.nextToken());
			nums[i] = new int[]{a,b};
		}
		
/*		Arrays.sort(nums, new Comparable<Integer>() {
			
			public int compare(int a, int b) {
				
				return 1;
			}
		});
*/		
	}
}
