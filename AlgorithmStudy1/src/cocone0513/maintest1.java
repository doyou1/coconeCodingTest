package cocone0513;

import java.util.ArrayList;

public class maintest1 {

	static ArrayList<String> results;
	
public static void main(String[] args) {
	String s = "abac";
	
	System.out.println(solution(s));
}

	static int solution(String s) {
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
