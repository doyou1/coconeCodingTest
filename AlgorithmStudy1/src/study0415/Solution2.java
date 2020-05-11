package study0415;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Solution2 {

	
	
	public static void main(String[] args) {
		
		Solution2 s2 = new Solution2();

		int begin = 349533413; 
		int end = 349533413;
		
		int result = s2.solution(begin,end);
		
		System.out.println(result);
	}
	
	public int solution(int begin, int end) {
		
		ArrayList<Integer> nums = new ArrayList<>();
		
		HashMap<Integer,Object> counters = new HashMap<Integer,Object>();
		
		for(int i=begin; i<=end; i++) {
			//i : 특정 정수, k : 약수일지 모르는 수
			int k = 2;
			while(k <= i) {
				if(i%k == 0) {
					nums.add(k);
					Integer str = null;
					str = (Integer) counters.get(k);
					if(str == null) {
						counters.put(k, 1);
					}else {
						int count = (int) counters.get(k);
						counters.put(k, count+1);
					}
				}
				k++;
			}
		}
		
		Collections.sort(nums);
		
		int result = 0;
		int maxCount = 0;
		for(int i=0;i<nums.size();i++) {
			int num = nums.get(i);
			int count = (int)counters.get(num);
			System.out.println("num : " + num + "count : " + count + "maxCount : " + maxCount);
			if(count > maxCount) {
				maxCount = count;
				result = num;
			}
		}
				
		if(result == 0) {
			result = begin;
		}
		
		
		return result;
	}
}
