package cocone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GreedTest11 {


	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		//끊어진 기타줄 수
		int N = Integer.valueOf(st.nextToken());
		//기타줄 브랜수 수
		int M = Integer.valueOf(st.nextToken());
		
		int[][] arr = new int[M][2];
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			//6개 패키지 가격
			arr[i][0] = Integer.valueOf(st.nextToken());
			//1개 낱개 가격
			arr[i][1] = Integer.valueOf(st.nextToken());
		}
		
		int result = 0;
		int low0 = arr[0][0];
		int low1 = arr[0][1];
		
		for(int[] temp : arr) {
			if(low0 > temp[0]) {
				low0 = temp[0];
			}
			if(low1 > temp[1]) {
				low1 = temp[1];
			}
		}
		
		result = (N/6) * low0 + (N%6) * low1;
		if(result > N * low1) {
			result = N * low1;
		}
		if(result > (N/6+1) * low0) {
			result = (N/6+1) * low0;
		}
		
		System.out.println(result);
	}
	
}