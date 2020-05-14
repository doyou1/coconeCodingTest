package cocone0513;

import java.util.Arrays;

public class qwe123 {

	public static void main(String[] args) {
		
		int[] A = {5,1,3,7};
		int[] B = {2,2,6,8};
		
		
		System.out.println(solution(A, B));
	}
	 static int solution(int[] A, int[] B) {
	
		 int[][] arr = new int[A.length][B.length];
		 
		 for(int i=0;i<arr.length;i++) {
			 for(int j=0;j<arr[i].length;j++) {
				 
				 if(i==j) continue;
				 
				 arr[i][j] = B[i] - A[j] > 0 ? B[i] - A[j] : 1000000000;
				 
			 }
		 }
		 
		
		 
		 for(int i=0;i<A.length;i++) {
			 for(int j=0;j<B.length;j++) {
				 if(A[i] < B[j]) {
					 arr[i][j] = Math.min(arr[i][j], B[j] - A[i]);
				 }
			 }
		 }
		 
		 int result = 0;
		 for(int[] temp : arr) {
			 int cnt = 0;
			 for(int t : temp) {
				 if(t != 0 && t != 1000000000) {
					 cnt++;
				 }
			 }
			 if(cnt > result) {
				 result = cnt;
			 }
		 }

		 return result;
	}
}
