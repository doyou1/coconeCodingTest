package study0414;

import java.util.Arrays;
import java.util.Comparator;

public class SortTest {

	public static void main(String[] args) {
		
		int[][] arr = {{1,2},{3,4},{5,6},{7,8},{9,10}};
		
		
		for(int[] a : arr) {
			System.out.println("a[1] : " + a[1]);
		}
		
		
		Arrays.sort(arr, new Comparator<int[]>() {
			
			@Override
			public int compare(int[] a2, int[] a1) {
				
				System.out.println("a2[1] : " + a2[1] + ", a1[1] : " + a1[1]);
				
				return a1[1] > a2[1] ? 1 : -1;
			}

		
		});
		
		
	}
}
