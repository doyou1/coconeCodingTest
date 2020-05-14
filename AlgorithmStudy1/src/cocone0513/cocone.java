package cocone0513;

import java.util.Arrays;

public class cocone {

	public static void main(String[] args) {
		int[] arr = {4, 1, 3, 2};
		System.out.println(solution(arr));
		
	}
	
	static boolean solution(int[] arr) {
	      boolean answer = true;
	    
	    int[] temp = new int[arr.length];
	    
	    Arrays.sort(arr);
	    //문자열을 뽑아내고, abac
	    
	    
	    int count = 1;
	    for(int i=0;i<arr.length;i++) {
	    	
	    	if(arr[i] == 0) continue;
	    	
	    	else if(arr[i] == count) {
	    		
	    	}
	    }
	    return answer;
	    }
}
