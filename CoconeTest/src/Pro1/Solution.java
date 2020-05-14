package Pro1;

import java.util.Arrays;

class Solution {
    public boolean solution(int[] arr) {
      boolean answer = true;

    Arrays.sort(arr);

    int count = 1;
    for(int i=0;i<arr.length;i++) {
        if(arr[i] == count) {
            count++;
            answer = true;
        }else if(i != 0 && arr[i] != count) {
            answer = false;
            break;
        }
    }
    return answer;
    }
}