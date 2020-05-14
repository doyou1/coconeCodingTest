package Pro3;

import java.util.Arrays;

class Solution{
    public int solution(int[] goods, int[] boxes){
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