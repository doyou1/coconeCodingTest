package cocone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GreedTest2 {


	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.valueOf(st.nextToken());
		int K = Integer.valueOf(st.nextToken());
		
		int[] arr = new int[N];
		int limit_i = 0;		
		for(int i=0;i<N;i++) {
			arr[i] = Integer.valueOf(br.readLine());
			if(arr[i] < K) {
				limit_i = i;
			}
		}
		
		int cnt = 0;
		
		for(int i=limit_i; i >=0;i--) {
			
			int money = arr[i];
			int how = K / money;
			cnt += how;
			K = K - (money * how);
			
			if(K == 0) break;
		}
		
		System.out.println(cnt);
	}
	
	
}
