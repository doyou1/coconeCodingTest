package study0413;

import java.util.ArrayList;

public class Solution3 {
/*
 * �ϳ��� ž(Tower of Hanoi)�� ������ �����Դϴ�. �� ���� ��հ� �� �⵿�� ���� �� �ִ� ũ�Ⱑ �پ��� ���ǵ��� �ְ�, ������ �����ϱ� ������ �� ��տ� ���ǵ��� ���� ���� ���� �ֵ��� ������� �׿� �ֽ��ϴ�. ������ ������ ���� �� ���� ������ ������Ű�鼭, �� ��տ� ���� ���ǵ��� �� ���� �״�� �ٸ� ������� �Űܼ� �ٽ� �״� ���Դϴ�.

�� ���� �ϳ��� ���Ǹ� �ű� �� �ֽ��ϴ�.
ū ������ ���� ���� ���� �־�� �ȵ˴ϴ�.
�ϳ��� ž�� �� ���� ����� ���� ���� 1��, 2��, 3���̶�� �ϰڽ��ϴ�. 1������ n���� ������ �ְ� �� n���� ������ 3�� �������� �ּ� Ƚ���� �ű���� �մϴ�.

1�� ��տ� �ִ� ������ ���� n�� �Ű������� �־��� ��, n���� ������ 3�� �������� �ּҷ� �ű�� ����� return�ϴ� solution�� �ϼ����ּ���.

���ѻ���
n�� 15������ �ڿ��� �Դϴ�.
 * */
	
	ArrayList<int[][]> list = new ArrayList<>();

	public static void main(String[] args) {
		Solution3 s3 = new Solution3();
		
		int n = 8;
		int[][] answer =s3.solution(n);
		
		
	}
	
	 public int[][] solution(int n) {

		 int[][] answer = {};
		 ArrayList<int[]> list = new ArrayList<int[]>();

		 
		 hanoi(n,1,3,2,list);
		 
		 
		 answer = list.toArray(new int[list.size()][]);
		 return answer;
	 }
	 
	 //������ ����, ������, ������, ������, �̵��� ������ ��ġ�� ���
	 public void hanoi(int num, int from, int to, int other, ArrayList<int[]> list) {
		 

		 //from���� other��
		 //��������
		 if(num == 1) {						  
			 list.add(new int[]{from,to});
			 System.out.println(from + "->" + to);
		 }
		 
		 else {
			
			//�� �Ʒ��� �ִ� ���� ����, ����������� �ű��
			hanoi(num -1, from, other, to,list);
			//�� �Ʒ��� �ִ� ������ ��ǥ������� �ű��
			hanoi(1, from, to,other,list);//���� ����
			//5���� ������ 
			hanoi(num -1, other, to, from,list);		 
		 }
	 }
}