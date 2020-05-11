package study0421;

import java.util.Stack;

public class Solution1 {

	public static void main(String[] args) {
		Solution1 s1 = new Solution1();
		
		int[] height = {3, 9, 9, 3, 5, 7, 2};
		
		int[] result = s1.solution(height);
		
		for(int r : result) {
			System.out.print(r + " ");
		}
	}
	
	public int[] solution(int[] height) {
		int cnt = 0;
		//for문의 조건에 stack.size()는 사용하면 안됨
		//pop, push에 따라 size가 달라짐
		int[] answer = new int[height.length];
		for(int i=0;i<height.length;i++) {
			for(int j=i-1;j>0;j--) {
				cnt++;
				if(height[j] > height[i]) {
					answer[i] = j+1;
					break;
				}
			}
		}
        System.out.println(cnt);
        return answer;
	}
	
}
