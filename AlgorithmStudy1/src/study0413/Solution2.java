package study0413;

public class Solution2 {
/*
 * H-Index�� �������� ���꼺�� ������� ��Ÿ���� ��ǥ�Դϴ�. ��� �������� H-Index�� ��Ÿ���� ���� h�� ���Ϸ��� �մϴ�. ��Ű���1�� ������, H-Index�� ������ ���� ���մϴ�.

� �����ڰ� ��ǥ�� �� n�� ��, h�� �̻� �ο�� ���� h�� �̻��̰� ������ ���� h�� ���� �ο�Ǿ��ٸ� h�� �ִ��� �� �������� H-Index�Դϴ�.

� �����ڰ� ��ǥ�� ���� �ο� Ƚ���� ���� �迭 citations�� �Ű������� �־��� ��, �� �������� H-Index�� return �ϵ��� solution �Լ��� �ۼ����ּ���.
 * */
	
	
	public static void main(String[] args) {
		Solution2 s2 = new Solution2();
		
		int[] citations = {3,0,6,1,5};
		
		int answer = s2.solution(citations);
		
		System.out.println(answer);
	}
	
	 public int solution(int[] citations) {
	     
		 //���� ū �ο�� ã��
		 int bestCheck = 0;
		 for(int i=0; i<citations.length;i++) {
			 if(bestCheck < citations[i]) {
				 bestCheck = citations[i];
			 }
		 }
		 

		 //�Ǿ��� �ִ�, �ǵڴ� �ּ�

	 	int answer = 0;
		//0���� ���� ū �ο������ for��
	 	for(int j=0; j<=bestCheck;j++) {
			 
			 int cnt = 0;
			 //���� ���� �ο���� Ư�� �ο������ ũ�ų� ������ cnt�� �÷���1 �ϰ�
			 for(int k=0; k<citations.length;k++) {
				 if(citations[k] >= j) {
					 cnt++;
				 }
			 }
			 
			 //for���� ���� ������ �� cnt�� Ư�� �ο�� ���� ũ�ų� ������ H-Index�� �� �� ����
			 //�ִ��� ������ �׷��� �� �� �ִ����� Ȯ��
			 if(j <= cnt) {
				 answer = j;
			 }else {
				 break;
			 }
		 }
		 
	 	//���������� �ִ밪 �ٷ� ã�� �� �־���
	 	
		System.out.println(answer);
		 
	        return answer;
	    }
}
