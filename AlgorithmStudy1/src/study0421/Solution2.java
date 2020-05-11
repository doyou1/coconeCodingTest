package study0421;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Solution2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Solution2 s2 = new Solution2();
		
//		s2.solution();
		s2.solution1();
		
	}
	
	public void solution() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int length = Integer.valueOf(br.readLine());		
		int[] arr = new int[length];
		
		int sum = 0;
		int unuseIndex = 0;
		
		for(int i=0;i<length;i++) {
			int num = Integer.valueOf(br.readLine());
			
			if(num != 0) {
				arr[unuseIndex] = num;
				unuseIndex++;
				continue;
			}else {
				arr[unuseIndex-1] = 0;
				unuseIndex--;
				continue;
			}
		}
		
		for(int a : arr) {
			sum += a;
		}
		System.out.println(sum);
	}

	public void solution1() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int length = Integer.valueOf(br.readLine());
		
		Stack<Integer> stack = new Stack<Integer>();
				
		
		for(int i=0;i<length;i++) {
			int num = Integer.valueOf(br.readLine());
			
			if(num != 0) {
				stack.push(num);
				continue;
			}else {
				stack.pop();
				continue;
			}
		}
		
		int sum = 0;
		
		//다시 length를 초기화하여 사용
		length = stack.size();
		for(int i=0; i<length;i++) {
			sum += stack.pop();
		}
		
		System.out.println(sum);
	}
}

