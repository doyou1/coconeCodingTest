package dptest0509;

public class main0509 {

	static int[] arr;
	
	public static void main(String[] args) {
		
		int x = 20;
		
		main0509 m = new main0509();
		arr = new int[x+1];
		System.out.println(m.dp(x));
	}
	
	public int dp(int x) {
		if(x == 1) return 1;
		if(x == 2) return 1;
		if(arr[x] != 0) return arr[x];
			
		return arr[x] = dp(x-1) + dp(x-2);
	}
}
