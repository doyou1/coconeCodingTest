package dptest0509;

public class titling2 {
	
	static int[] arr = new int[1001]; 
	
	public static void main(String[] args) {
		titling2 t = new titling2();
		int n = 8;
				
		System.out.println(t.dp(n));
	}
	
	public int dp(int n) {
		
		if(n == 1) return 1;
		if(n == 2) return 3;
		if(arr[n] != 0) return arr[n];
		
		
		return arr[n] = (dp(n-1) + dp(n-2) + dp(n-2)) % 10007;
	}
}
