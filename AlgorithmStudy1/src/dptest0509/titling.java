package dptest0509;

public class titling {
	
	static int[] arr = new int[1001]; 
	
	public static void main(String[] args) {
		titling t = new titling();
		int n = 2;
				
		System.out.println(t.dp(n));
	}
	
	public int dp(int n) {
		
		if(n == 1) return 1;
		if(n == 2) return 2;
		if(arr[n] != 0) return arr[n];
		
		
		return arr[n] = (dp(n-1) + dp(n-2)) % 10007;
	}
}
