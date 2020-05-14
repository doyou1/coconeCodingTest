package Pro2;

import java.util.ArrayList;

class Solution {
	
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
