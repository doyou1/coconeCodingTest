package cocone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class GreedTest10 {


	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tC = Integer.valueOf(br.readLine());
		ArrayList<int[][]> list = new ArrayList<>();
		for(int i=0; i<tC; i++) {
			int rC = Integer.valueOf(br.readLine());
			int[][] temp = new int[rC][2];
			for(int j=0; j<rC;j++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				temp[j][0] = Integer.valueOf(st.nextToken());
				temp[j][1] = Integer.valueOf(st.nextToken());
			}
			list.add(temp);
		}

		
		
		if(list.isEmpty()) {
			System.out.println(0);
		}else {
			for(int[][] temp : list) {
				
				Arrays.sort(temp, new Comparator<int[]>() {
					
					public int compare(int[] n1, int[] n2) {
						
						if(n1[0] == n2[0]) {	
							return n1[1] > n2[1] ? 1 : -1;
						}else {
							return n1[0] > n2[0] ? 1 : -1;							
						}
						
					}
				});
								
				//둘 중 더 높은 숫자
				int n0 = temp[0][0];
				int n1 = temp[0][1];
				int count = 1;				

				for(int i = 1; i<temp.length;i++) {
					int t0 = temp[i][0];
					int t1 = temp[i][1];
					
					if(n0 > t0 || n1 > t1) {
						count++;
						n0 = t0;
						n1 = t1;
					}
				}

				System.out.println(count);
			}

		}
	}
	
}