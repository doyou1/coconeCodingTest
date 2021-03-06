package study0509;

import java.util.ArrayList;
import java.util.Collections;

public class Solution1 {

	public static void main(String[] args) {
		
		
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		
		solution(array,commands);
	}
	
	public static int[] solution(int[] array, int[][] commands) {
		int[] result = new int[commands.length];
		
		for(int x = 0; x < commands.length; x++) {
			int[] com = commands[x];
			int i = com[0];
			int j = com[1];
			int k = com[2];
			
			ArrayList<Integer> temp = new ArrayList<>();
			for(int y=i;y<=j;y++) {
				temp.add(array[y-1]);
			}
			Collections.sort(temp);
			result[x] = temp.get(k-1);
		}
		
		return result;
		
	}
}
