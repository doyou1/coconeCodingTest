package study0422;

public class Solution1 {

	static int count = 0;
	
	public static void main(String[] args) {
		Solution1 s1 = new Solution1();
		
		int[] numbers = {1,1,1,1,1};
		int target = 3;
		
		s1.solution(numbers, target);
		System.out.println(count);
	}
	
	
	public int solution(int[] numbers, int target) {

	    collback(numbers, target, 0,0);
	    
	    return count;
	}
	
	public void collback(int[] numbers, int target, int length, int sum){
	
		if(length == numbers.length) {
			if(sum == target) {
				count = count + 1;
			}
			return;
		}
		
		
		collback(numbers,target,length+1,sum + numbers[length]);
		collback(numbers,target,length+1,sum - numbers[length]);
	
	}
	
}
