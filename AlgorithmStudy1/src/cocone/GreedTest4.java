package cocone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GreedTest4 {


	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int money = 1000 - Integer.valueOf(br.readLine());
		
		int[] changes = {500,100,50,10,5,1};

		int cnt = 0;
		
		for(int cha : changes) {
			int x = money / cha;
			if(x > 0) {
				money -= cha * x;
				cnt += x;
			}
			
			if(money == 0) {
				break;
			}
		}
		
		System.out.println(cnt);
	}
	
	
}
