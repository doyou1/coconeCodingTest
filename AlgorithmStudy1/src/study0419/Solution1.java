package study0419;

import java.util.Arrays;

public class Solution1 {
	/*
	 * �������� n���� ���� ���� �ִ�. ������ ���� x��ǥ�� �־����� ��, 
	 * n2���� ��� �ֿ� ���ؼ� �Ÿ��� ���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 *	��, ��� i, j�� ���ؼ� |x[i] - x[j]|�� ���� ���ϴ� ���̴�.
	 * */
	public static void main(String[] args) {
		String n = "5";
		String str = "1 5 3 2 4";
		String[] arr = str.split(" ");
		Arrays.sort(arr);
		int[][] input = new int[Integer.parseInt(n) * Integer.parseInt(n)][2];
		
		int cnt = 0;
		for(int i=0;i<Integer.parseInt(n);i++) {
			for(int j=0;j<Integer.parseInt(n);j++) {
				int x = Integer.parseInt(arr[i]);
				int y = Integer.parseInt(arr[j]);
				input[cnt] = new int[]{x,y};
				cnt++;
			}
		}
				
		Solution1 s1 = new Solution1();
		int sum = s1.solution(input);
		
		System.out.println(sum);
	}
	
	public int solution(int[][] input) {
		int sum = 0;
		
		for(int i=0;i<input.length;i++) {
			int[] arr = input[i];
			int x = arr[0];
			int y = arr[1];
			
			sum += Math.abs(x-y);
		}
		
		return sum;
	}
}