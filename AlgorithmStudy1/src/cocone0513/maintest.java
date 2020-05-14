package cocone0513;

import java.util.Arrays;

public class maintest {
	
	
public static void main(String[] args) {
	int[] arr = {4,1,3};
	System.out.println(solution(arr));
}

static boolean solution(int[] arr) {
    boolean answer = true;
    
    Arrays.sort(arr);
    
    int count = 0;
    for(int i=0;i<arr.length;i++) {
    	if(arr[i] <= count) {
    		count++;
    		answer = true;
    	}else {
    		answer = false;
    		break;
    	}
    }
    return answer;
}
}
