package study0422;

public class Solution {
	  
    static int count = 0;
    
    public int solution(int[] numbers, int target) {
        int answer = 0;
	    boolean check = true;
	    int sum = 0;
	    int cnt = 0;
	    collback(numbers, target, check, cnt,sum);
	    collback(numbers, target, !check, cnt,sum);
	    
	    answer = count/2;
        return answer;
    }
    
    public void collback(int[] numbers, int target, boolean check, int cnt, int sum){
	
		if(cnt == numbers.length) {
			if(sum == target) {
				count = count + 1;
			}
			return;
		}
		
		if(check) {
			sum += numbers[cnt];
			
		}else {
			sum -= numbers[cnt];
		}
		
		
		collback(numbers,target,check,cnt+1,sum);
		collback(numbers,target,!check,cnt+1,sum);
	
    }

}
