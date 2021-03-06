package cocone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class GreedTest12_1 {
	
	static boolean[] check = new boolean[10];
	static int n;
	static char[] a = new char[10];
	static ArrayList<String> answers = new ArrayList<>();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.valueOf(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		for(int i=0;i<n;i++) {
			a[i] = st.nextToken().charAt(0);
		}
		
		go(0,"");
		Collections.sort(answers);
		System.out.println(answers.get(answers.size()-1));
		System.out.println(answers.get(0));
	}	
	
	static void go(int index, String answer) {
		if(index == n+1) {
			answers.add(answer);
			return;
		}		
				
		for(int i=0; i<10;i++) {
			if(check[i]) continue;
			else if(index == 0 || 
					ck(answer.charAt(index-1)
							, Character.toChars(i)[0]
							, a[index -1])) {
				//중복값 제거를 위해
				check[i] = true;
				go(index+1, answer + i);
				check[i] = false;
			}
		}
		
	}
	
	static boolean ck(char a, char b, char c) {
		if(c == '<') {
			if(a > b) {
				return false;
			}
		}else if(c == '>') {
			if(a < b) {
				return false;
			}
		}
		return true;
	}
}