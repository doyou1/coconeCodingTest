package cocone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DynamicProgramming5 {
		
	static int result;
	static int N;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.valueOf(br.readLine());
		result = 1000 * N + 1;
		
		int[][] arr = new int[N][3];
		boolean[][] check = new boolean[N][3];
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			arr[i][0] = Integer.valueOf(st.nextToken());
			arr[i][1] = Integer.valueOf(st.nextToken());
			arr[i][2] = Integer.valueOf(st.nextToken());
		}
		
		dp(arr, check, 0, 0, 0);
		System.out.println(result);
	}	
	
	static int dp(int[][] arr
			, boolean[][] check
			, int n
			, int m
			, int temp) {
		
		if(n == N) {
			if(result < temp && temp != 0) {
				result = temp;
			}
			return result;
		}
		
		
		if(check[n][m] == true) {
			System.out.println(temp);
			return dp(arr,check,n+1,m+1,temp+arr[n+1][m+1]);
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				check[i][j] = true;
				dp(arr,check,i,j,temp+arr[i][j]);
				check[i][j] = false;
			}
		}
		
		return arr[n][m];
	}
	
}
