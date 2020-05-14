package cocone0513;

public class cocone0513 {

	public static void main(String[] args) {
		
		
		int n = 5;
		int[][] results = {{4,3},{4,2},{3,2},{1,2},{2,5}};
		solution(n, results);
	}
	
	static void solution(int n, int[][] results) {
		int answer = 0;
		
		int[][] arr = new int[results.length+1][results.length+1];
		boolean[][] checks = new boolean[results.length+1][results.length+1];
		
		for(int[] temp : results) {
			
			arr[temp[0]][temp[1]] = 1;
			checks[temp[0]][temp[1]] = true;
			
		}
		
		for(int i=1;i<arr.length;i++) {
			for(int j=1;j<arr.length;j++) {
				if(checks[i][j]) {
					checks[j][i] = true;
				}
			}
		}
	
		for(int i=1;i<arr.length;i++) {
			boolean check = false;
			for(int j=1;j<arr.length;j++) {		
				if(checks[j][i]) {
					
				}
			}
		}
		System.out.println(answer);
	}
}
