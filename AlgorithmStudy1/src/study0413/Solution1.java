package study0413;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Solution1 {
	
/*	���� ū ��
	���� ����
	0 �Ǵ� ���� ������ �־����� ��, ������ �̾� �ٿ� ���� �� �ִ� ���� ū ���� �˾Ƴ� �ּ���.

	���� ���, �־��� ������ [6, 10, 2]��� [6102, 6210, 1062, 1026, 2610, 2106]�� ���� �� �ְ�, ���� ���� ū ���� 6210�Դϴ�.

	0 �Ǵ� ���� ������ ��� �迭 numbers�� �Ű������� �־��� ��, ������ ���ġ�Ͽ� ���� �� �ִ� ���� ū ���� ���ڿ��� �ٲپ� return �ϵ��� solution �Լ��� �ۼ����ּ���.

	���� ����
	numbers�� ���̴� 1 �̻� 100,000 �����Դϴ�.
	numbers�� ���Ҵ� 0 �̻� 1,000 �����Դϴ�.
	������ �ʹ� Ŭ �� ������ ���ڿ��� �ٲپ� return �մϴ�.
	����� ��
	numbers	return
	[6, 10, 2]	6210
	[3, 30, 34, 5, 9]	*/
		
	
	ArrayList<String> list = new ArrayList<>();
	
	public static void main(String[] args) {
		
		//main�޼ҵ�� static�̰� solution�޼ҵ�� �Ϲݸ޼ҵ��̱⶧����
		//main�޼ҵ忡�� solution�޼ҵ带 �θ����� Ŭ���� ��ü ���� ��
		//�� ��ü�� �̿��� solution�޼ҵ带 ȣ���� �� ����
		Solution1 s1 = new Solution1();
		
		//������ ������
		int[] numbers = {7,9,2};
		String result = s1.solution(numbers);
		System.out.println(result);

/*		//������ ������
		int[] numbers2 = {3, 30, 34, 5, 9};
		
		String result2 = s1.solution(numbers2);
		System.out.println(result2);
*/		
	}
	
	//solution�̶� �޼ҵ�� � ����� �����ϴ���
	//int[] �ڷ����� parameter�� �޾�
	//�� int[] �迭 ���� ���ڵ��� �������� ���� �� �ִ� ���� ū ���� �����ϴ� ����� �����Ѵ�
	public String solution(int[] numbers) {//numbers = {6,10,2}
		
		
	    // 1. ���� �迭�� ���ڿ� �迭�� ��ȯ.
		// numbers.length : 3
	    String[] strNumbers = new String[numbers.length];

	     for(int i = 0; i < strNumbers.length; i ++) {
	         strNumbers[i] = Integer.toString(numbers[i]);
	     }
	     
	     for(String s : strNumbers) {
	    	 System.out.print(s + " ");
	     }
	     
	     System.out.println();
	     
	     //	6 10 2 
	     // 2. ���ڿ� �迭�� ������������ �����Ѵ�. ū��~��������
	     // String�� �̷��� ���ĵ��� �ʴ´�. 6 2 10
	     // char = 1 + char = 0
	     // �����ڵ� 	     
	     Arrays.sort(strNumbers, new Comparator<String>() {
	         @Override
	         public int compare(String s1, String s2) {
	        	 // 1ȸ�� 6 10 2  
	        	 // s1 : 10(����), s2 : 6(����)
	        	 //		610			>		106 = ����� ����
	        	 //if((s2 + s1) > (s1 + s2)) true�� ���
	        	 //false�� ����
	        	 //������ 0
	        	 
	        	 // {2,9,7}
	        	 //1ȸ�� s1 : 9(����), s2 : 2(����)
	        	 //			29		<		92 = ����
	        	 // {9, 2, 7}
	        	 //2ȸ�� s1 : 7(����), s2 : 2(����)
	        	 //			27		<		72 = ����
	        	 // {9,7,2}
	        	 // 3ȸ�� s1 : 7 , s2 : 9
	        	 //			97		>		79 = ���
	        	 // 4ȸ�� s1 : 2 , s2 : 7
	        	 //			72		>		27 = ���
	        	 return (s2 + s1).compareTo(s1 + s2);
	         }
	     });
	     
	     //strNumbers : {9,7,2}
	     //strNumbers�� ����� �ִ� ���� ū ���� 972
	     for(String s : strNumbers) {
	    	 System.out.print(s + " ");
	     }
	     //strNumbers > 6 2 10 �̷��� ��ȯ��
	
	     System.out.println();
	     
	     // 3. ���ڿ��� 0���� �����ϴ� �� '0'���� ġȯ�Ѵ�.
	     if (strNumbers[0].equals("0")) {
	    	 return "0";
	     }
	     
	     
	     // 4. ���ĵ� ���� �迭�� ���ڿ��� ��ȯ�Ѵ�.
	     String answer = "";
	     for(String strNumber:strNumbers) {
	    	 //�� for���� 3�� ���ư���
	         answer += strNumber;
	         //1�� answer�� 9
	         //2�� answer�� 97
	         //3�� answer�� 972
	     }
	     	     
	     //answer�� "972"
	     return answer;
	}	

	
	public String sol(int[] numbers) {
		// 1. ���� �迭�� ���ڿ� �迭�� ��ȯ.
	     String[] strNumbers = new String[numbers.length];
	     for(int i = 0; i < numbers.length; i ++) {
	         strNumbers[i] = Integer.toString(numbers[i]);
	     }
	     
	     
	     //�տ� ���ڰ� 0�̸� 10������ �������� ����
	     for(int i=0; i<strNumbers.length-1;i++) {
	    	 
	    	 for(int j=i;j<strNumbers.length-1;j++) {
	    		 
		    	 String s1 = strNumbers[i] + strNumbers[i+1]; 
		    	 String s2 = strNumbers[i+1] + strNumbers[i];
		    	 System.out.println(strNumbers[i] + " : " + strNumbers[i+1]);
		    	 System.out.println(s1 + " : " + s2);
		    	 //����̸� s1�� �� ū��, �����̸� s2�� �� ū��
		    	 System.out.println();
		    	 int check = s1.compareTo(s2);
		    	 
		    	 String temp = "";
		    	 if(check < 0) {
		    		 temp = strNumbers[i];
		    		 strNumbers[i] = strNumbers[i+1];
		    		 strNumbers[i+1] = temp;
		    	 }
	    	 }
	     }
		String answer = "";	     

		for(int i=0; i<strNumbers.length-1;i++) {
			answer += strNumbers[i];
	    }
	     
		System.out.println(answer);
		return "";
	}
}
