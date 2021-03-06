package cocone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
/*
class Graph{
	
	class Node{
		
		int data;
		boolean visited; 
		
		public Node() {
			this.data = data;
			this.visited = false;
		}
	}
}
*/
public class DynamicProgramming11 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = 51, m = 51;
		
		ArrayList<int[][]> list = new ArrayList<int[][]>();
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			n = Integer.valueOf(st.nextToken());
			m = Integer.valueOf(st.nextToken());
			
			if(n == 0 && m == 0) {
				break;
			}
			int[][] arr = new int[n+1][m+1];
			
			if(n == 1 && m == 1) {
				br.readLine();
			}else {

				for(int i=0;i<m;i++) {
					st = new StringTokenizer(br.readLine(), " ");
					for(int j=0;j<n;j++) {
						arr[j][i] = Integer.valueOf(st.nextToken());
					}
				}
			}		
			list.add(arr);
		}
		
		System.out.println(list.toString());
	}	

}
