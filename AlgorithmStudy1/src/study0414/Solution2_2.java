package study0414;

import java.util.ArrayList;

public class Solution2_2 {
//405
//123

	//159
	public static void main(String[] args) {
		
		/*
		 * Ż�� Ŭ���� . �ӵ�, Ż���ǹ���, Ż���� ����, Ż���� ��ġ
		 * get set �޼ҵ�
		 * 
		 * Ż���� ��ġ(�ӵ� * ���� /����) - �޼ҵ�
		 * */
		
		//������ 152
		//159
		//S : 1 B : 1 // 356 : S : 1 B : 0
		int[][] baseball = {{123, 1, 1}, {356, 1, 0}, {327, 2, 0}, {489, 0, 1}};
		int[][] baseball1 = {{123, 0, 1}, {456, 1, 0}, {789, 0, 1}, {147, 0, 1},
				{159,0,0},{276,0,0}};
		int[][] baseball2 = {{123, 2, 0}, {456, 0, 0}, {789, 0, 1}, {125, 1, 0},
				{173,1,0},{823,2,0}};
		int[][] baseball3 = {{123, 2, 0}, {456, 0, 0}, {789, 0, 1}};
		int[][] baseball4 = {{123, 0, 0}};
		int[][] baseball5 = {{123, 0, 1},{456,0,0},{789,1,1}};
		
		
		
		Solution2_2 s2 = new Solution2_2();
		
		int result = s2.solution(baseball5);
		
		System.out.println(result);
	//	System.out.println("result : " + result);
	}
	
	
	public int solution(int[][] baseball) {
	        
		ArrayList<String> numbers = new ArrayList<>();
		
		//123~987������ �����ͼ� ����(����! 0�� ���ų� �ߺ��Ǵ� ���� �־ �ȵ�)
		for(int i=1;i<10;i++) {
			String si = String.valueOf(i);
			for(int j=1;j<10;j++) {
				String sj = String.valueOf(j);
				for(int k=1;k<10;k++) {
					String sk = String.valueOf(k);
					
					if(si.equals(sj) || si.equals(sk) || sj.equals(sk)) {
						continue;
					}
					
					String s = si+sj+sk;
					numbers.add(s);
				}
			}
		}
		
		
		
		ArrayList<String> result = new ArrayList<>();
		
        //�����ͼ� ��������
		for(int n = 0; n<numbers.size(); n++) {
			//Ư�� ������
			String num = numbers.get(n);
			
			//Strike, Ball�� ���� �����ϴ°��� üũ�ϱ� ���� ����
			int check = 0;
			
			for(int i=0; i<baseball.length; i++) {
				
				//Ư�� ���� 1
				String bb = baseball[i][0] + "";
				
				//0�� �� ������� �ѹ� �� üũ, ���ʿ�
				if(bb.length() != 3) {
					int size = bb.length();
					if(size == 0) {
						bb = "000";
					}else if(size == 1) {
						bb = "00" + bb;
					}else if(size == 2) {
						bb = "0" + bb;
					}
                }
				
                int strike = 0;
				int ball = 0;
				
				for(int j=0;j<3;j++) {

					//num = 126			bb = 356  
					if(num.charAt(j) == bb.charAt(j)) {
						strike++;
					}
						//strike 1���̰� �� 2
					if(bb.contains(num.charAt(j) + "")) {
						ball++;
					}
					
				}

				ball = ball - strike;
				

				if(strike == baseball[i][1] && ball == baseball[i][2]) {
					check++;
				}
				
				//�� 4���� ������ ��� �����ߴ���
				//{123, 1, 1}, {356, 1, 0}, {327, 2, 0}, {489, 0, 1}
				//123,1,1 
				
				
			}
			
			if(check == baseball.length) {
				result.add(num);
			}
		}	
		
		System.out.println(result);
		int answer = result.size();
		return answer;
	}	
}