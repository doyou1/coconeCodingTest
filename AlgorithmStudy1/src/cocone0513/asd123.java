package cocone0513;

import java.util.Arrays;

public class asd123 {

	static int[][] arr;
	
	public static void main(String[] args) {
	
		int[] goods = {5,3,7};
		int[] boxes = {3,7,6};
		
		arr = new int[goods.length][boxes.length];
		
System.out.println(solution(goods,boxes));
	}
	
	static int solution(int[] goods, int[] boxes){
        int answer = 0;

        Arrays.sort(goods);
        Arrays.sort(boxes);
    	
        int j = goods.length-1;
        for(int i=boxes.length-1;i >=0 ; i--) {
        	int box = boxes[i];
        	
        	for(int k=j;k>=0;k--) {
        		if(box < goods[k]) continue;
        		else {
        			answer++;
        			j = k-1;
        			break;
        		}
        	}
        	
        	if(goods.length == answer) {
        		break;
        	}
        }
        
        return answer;
    }
}
