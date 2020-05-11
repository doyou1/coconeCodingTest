package study0414;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Solution2 {
/*
 * ���� ����
���� �߱� �����̶� 2���� ���ΰ� ������ ���ڸ� ���ߴ� �����Դϴ�. �����غ���

���� ���� �ٸ� 1~9���� 3�ڸ� ������ ���ڸ� ���� �� ���ο��� 3�ڸ��� ���ڸ� �ҷ��� ����� Ȯ���մϴ�. �׸��� �� ����� ���� ��밡 ���� ���ڸ� ������ �� �����ϴ�.

* ���ڴ� ������, ��ġ�� Ʋ���� ���� ��
* ���ڿ� ��ġ�� ��� ���� ���� ��Ʈ����ũ
* ���ڿ� ��ġ�� ��� Ʋ���� ���� �ƿ�
���� ���, �Ʒ��� ��찡 ������

A : 123
B : 1��Ʈ����ũ 1��.
A : 356
B : 1��Ʈ����ũ 0��.
A : 327
B : 2��Ʈ����ũ 0��.
A : 489
B : 0��Ʈ����ũ 1��.
�̶� ������ ���� 324�� 328 �� �����Դϴ�.

������ �� �ڸ��� ��, ��Ʈ����ũ�� ��, ���� ���� ���� 2���� �迭 baseball�� �Ű������� �־��� ��, ������ ���� ������ return �ϵ��� solution �Լ��� �ۼ����ּ���.

���ѻ���
������ ���� 1 �̻� 100 ������ �ڿ����Դϴ�.
baseball�� �� ���� [�� �ڸ��� ��, ��Ʈ����ũ�� ��, ���� ��] �� ��� �ֽ��ϴ�.
����� ��
baseball	return
[[123, 1, 1], [356, 1, 0], [327, 2, 0], [489, 0, 1]]	2
����� �� ����
������ ���� ���� �����ϴ�.

��ó
 * */
	
	
	public static void main(String[] args) {
		
		ArrayList<String> numbers = new ArrayList<>();

		//111~999������ �����ͼ� ����
		for(int i=0;i<10;i++) {
			String si = String.valueOf(i);
			for(int j=0;j<10;j++) {
				String sj = String.valueOf(j);
				for(int k=0;k<10;k++) {
					String sk = String.valueOf(k);
					
					String s = si+sj+sk;
					numbers.add(s);
				}
			}
		}
		
		//input testdata ����
		int length = 4;
		int[] a = {123,1,1};
		int[] b = {356,1,0};
		int[] c = {327,2,0};
		int[] d = {489,0,1};
		int[][] baseballs = new int[length][3];
		baseballs[0] = a;
		baseballs[1] = b;
		baseballs[2] = c;
		baseballs[3] = d;
		
		//������ �����ϴ� ���� ��� ���� Collection
		ArrayList<String> result = new ArrayList<>();
		
		Solution2 s2 = new Solution2();
		
		//000~999�� �����ͼ� ��������
		for(int n = 0; n<numbers.size(); n++) {
			//Ư�� ������
			String num = numbers.get(n);
			
			//Strike, Ball�� ���� �����ϴ°��� üũ�ϱ� ���� ����
			int check = 0;
			for(int i=0; i<baseballs.length; i++) {
				
				//Ư�� ���� 1
				String baseball = baseballs[i][0] + "";
				if((baseballs[i][0] + "").length() != 3) {
					int size = baseball.length();
					
					if(size == 0) {
						baseball = "000";
					}else if(size == 1) {
						baseball = "00" + baseball;
					}else if(size == 2) {
						baseball = "0" + baseball;
					}
				}

				System.out.println("num : "+num + " baseball : " + baseball);
				int[] arr = s2.count(num, baseball);
				
				System.out.println("strike : " + arr[0] + "ball : " + arr[1]);
				
				int strike = arr[0];
				int ball = arr[1] - strike;
				
				if(strike == baseballs[i][1] && ball == baseballs[i][2]) {
//					result.add(baseball);
					check++;
				}
				System.out.println("======================");
				
				if(check == baseballs.length) {
					result.add(baseball);
				}
			}
			
			
		}
		
		System.out.println(result.size());
			
	}
	
	
	public int[] count(String num,String baseball) {
		

		int[] arr = {0,0};
		
		for(int i=0;i<3;i++) {
			if(num.charAt(i) == baseball.charAt(i)) {
				arr[0]++;
			}
					
			if(baseball.contains(num.charAt(i) + "")) {
				arr[1]++;
			}
			
		}
		
		
		
		return arr;
	}
	
	/*
	public int solution(int[][] baseball) {
		
		ArrayList<Integer> strikes = new ArrayList<>();
		ArrayList<Integer> balls = new ArrayList<>();
		
		
		for(int i=0;i<baseball.length;i++) {
			int[] temp = baseball[i];
			int num = temp[0];
			String[] strTemp = null;
			strTemp = Integer.toString(num).split("");
			
			//�������� ����
			Arrays.sort(strTemp, new Comparator<String>(){
				@Override
				public int compare(String start, String end) {
					
					return start.compareTo(end);
				}
			});
			
//			String str = strTemp[0] + strTemp[1] + strTemp[2];
			
//			int lowestNum = Integer.parseInt(str);
			
			if(temp[1] == 0) {
				//strikes�� 0
				
			}else if(temp[1] == 1) {
				//strikes�� 1
				
				//���� index1
			}else if(temp[1] == 2) {
				//strikes�� 2
			}else if(temp[1] == 3) {
				return 1;
			}
			
			
			
		}
		
		
		int answer = 0;
		
		return answer;
	}
	
	*/
}
