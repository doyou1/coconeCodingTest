package Pro2;

import java.util.ArrayList;

class Solution {
	/* 같은 알파벳이 없는 지, 다른 부분 문자열과 중복되지 않는 것만 골라내는게 중요했습니다.
	 * 같은 알파벳이 없는지는 문자열을 만들면서 계속 확인했고
	 * 중복되는 문자열이 없는지는 마지막에 contains메소드를 활용해 체크했습니다.
	 * 문제 설명
좋은 부분 문자열이란 어떤 문자열 s의 부분 문자열이면서 같은 알파벳이 두 번 이상 나타나지 않는 문자열을 말합니다. 예를 들어 주어진 문자열이 abac 일 때, 부분 문자열 a, ab, bac등은 원래 문자열 abac 의 부분 문자열이면서 문자열 내에 같은 알파벳이 두 번 이상 나타나지 않으므로 좋은 부분 문자열입니다. 그러나 aba, abac는 문자열 내에 같은 알파벳 'a'가 두 번 이상 나타나므로 좋은 부분 문자열이 아닙니다. 문자열 s가 주어질 때 좋은 부분 문자열의 개수를 return 하도록 solution 함수를 완성해주세요.

제한사항
문자열 s의 길이는 1 이상 100 이하이며, 알파벳 소문자로만 이루어져 있습니다.
여러 번 나타나는 같은 부분 문자열은 하나로 세면 됩니다.
입출력 예
s   result
abac   7
abcd   10
zxzxz   4
입출력 예 설명
입출력 예 #1
다음의 7가지 좋은 부분 문자열이 있습니다.
a, b, c, ab, ba, ac, bac

입출력 예 #2
다음의 10가지 좋은 부분 문자열이 있습니다.
a, b, c, d, ab, bc, cd, abc, bcd, abcd

입출력 예 #3
다음의 4가지 좋은 부분 문자열이 있습니다.
z, x, zx, xz
	 * */
    public int solution(String s) {
        int answer = 0; 

        ArrayList<String> list = new ArrayList<>();


        for(int i=0;i<s.length();i++) {
            StringBuffer sb = new StringBuffer();
            sb.append(s.charAt(i));
            list.add(sb.toString());
            int count = 0;
            for(int j=i;j<s.length();j++) {
                if(count == 2) {
                    break;
                }
                else if(!sb.toString().contains(s.charAt(j) + "") ) {
                    sb.append(s.charAt(j));
                    list.add(sb.toString());
                }else {
                    count++;
                    continue;
                }
            }
        }

        ArrayList<String> temp = new ArrayList<>();

        for(String a : list) {
            if(!temp.contains(a)) {
                temp.add(a);
            }
        }

        return temp.size();
    }
}
