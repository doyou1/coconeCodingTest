package cocone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Graph2 {
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//도시의 개수
		int N = Integer.valueOf(br.readLine());
		
		//버스의 개수
		int M = Integer.valueOf(br.readLine());
		
		int[][] distances = new int[101][101];
		
		for (int i = 1; i <= N; i++) {
		    for (int j = 1; j <= N; j++) {
		        if (i == j) {
		            continue;
		        }
		        distances[i][j] = 1000000;
		    }
		}
		
		StringTokenizer st;
		
		for (int i = 0; i < M; i++) {
		    st = new StringTokenizer(br.readLine(), " ");
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int time = Integer.parseInt(st.nextToken());
			distances[start][end] = Math.min(distances[start][end], time);
		}
		
		for (int k = 1; k <= N; k++) {
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					distances[i][j] = Math.min(distances[i][j], (distances[i][k] + distances[k][j]));
				}
			}
		}
		
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=N;j++) {
				System.out.print(distances[i][j] + " ");				
			}
			System.out.println();
		}
	}
}
