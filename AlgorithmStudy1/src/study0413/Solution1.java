package study0413;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Solution1 {
	
/*	가장 큰 수
	문제 설명
	0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.

	예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.

	0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.

	제한 사항
	numbers의 길이는 1 이상 100,000 이하입니다.
	numbers의 원소는 0 이상 1,000 이하입니다.
	정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.
	입출력 예
	numbers	return
	[6, 10, 2]	6210
	[3, 30, 34, 5, 9]	*/
		
	
	ArrayList<String> list = new ArrayList<>();
	
	public static void main(String[] args) {
		
		//main메소드는 static이고 solution메소드는 일반메소드이기때문에
		//main메소드에서 solution메소드를 부르려면 클래스 객체 생성 후
		//그 객체를 이용해 solution메소드를 호출할 수 있음
		Solution1 s1 = new Solution1();
		
		//임의의 정수들
		int[] numbers = {7,9,2};
		String result = s1.solution(numbers);
		System.out.println(result);

/*		//임의의 정수들
		int[] numbers2 = {3, 30, 34, 5, 9};
		
		String result2 = s1.solution(numbers2);
		System.out.println(result2);
*/		
	}
	
	//solution이란 메소드는 어떤 기능을 수행하느냐
	//int[] 자료형의 parameter를 받아
	//그 int[] 배열 내의 숫자들의 조합으로 만들 수 있는 가장 큰 수를 도출하는 기능을 수행한다
	public String solution(int[] numbers) {//numbers = {6,10,2}
		
		
	    // 1. 숫자 배열을 문자열 배열로 변환.
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
	     // 2. 문자열 배열을 내림차순으로 정렬한다. 큰수~작은수로
	     // String은 이렇게 정렬되지 않는다. 6 2 10
	     // char = 1 + char = 0
	     // 유니코드 	     
	     Arrays.sort(strNumbers, new Comparator<String>() {
	         @Override
	         public int compare(String s1, String s2) {
	        	 // 1회차 6 10 2  
	        	 // s1 : 10(후자), s2 : 6(전자)
	        	 //		610			>		106 = 양수가 나와
	        	 //if((s2 + s1) > (s1 + s2)) true면 양수
	        	 //false면 음수
	        	 //같으면 0
	        	 
	        	 // {2,9,7}
	        	 //1회차 s1 : 9(후자), s2 : 2(전자)
	        	 //			29		<		92 = 음수
	        	 // {9, 2, 7}
	        	 //2회차 s1 : 7(후자), s2 : 2(전자)
	        	 //			27		<		72 = 음수
	        	 // {9,7,2}
	        	 // 3회차 s1 : 7 , s2 : 9
	        	 //			97		>		79 = 양수
	        	 // 4회차 s1 : 2 , s2 : 7
	        	 //			72		>		27 = 양수
	        	 return (s2 + s1).compareTo(s1 + s2);
	         }
	     });
	     
	     //strNumbers : {9,7,2}
	     //strNumbers로 만들수 있는 가장 큰 수는 972
	     for(String s : strNumbers) {
	    	 System.out.print(s + " ");
	     }
	     //strNumbers > 6 2 10 이렇게 변환됨
	
	     System.out.println();
	     
	     // 3. 문자열이 0으로 시작하는 건 '0'으로 치환한다.
	     if (strNumbers[0].equals("0")) {
	    	 return "0";
	     }
	     
	     
	     // 4. 정렬된 숫자 배열을 문자열로 변환한다.
	     String answer = "";
	     for(String strNumber:strNumbers) {
	    	 //이 for문은 3번 돌아간다
	         answer += strNumber;
	         //1번 answer는 9
	         //2번 answer는 97
	         //3번 answer는 972
	     }
	     	     
	     //answer는 "972"
	     return answer;
	}	

	
	public String sol(int[] numbers) {
		// 1. 숫자 배열을 문자열 배열로 변환.
	     String[] strNumbers = new String[numbers.length];
	     for(int i = 0; i < numbers.length; i ++) {
	         strNumbers[i] = Integer.toString(numbers[i]);
	     }
	     
	     
	     //앞에 숫자가 0이면 10진수로 이해하지 못함
	     for(int i=0; i<strNumbers.length-1;i++) {
	    	 
	    	 for(int j=i;j<strNumbers.length-1;j++) {
	    		 
		    	 String s1 = strNumbers[i] + strNumbers[i+1]; 
		    	 String s2 = strNumbers[i+1] + strNumbers[i];
		    	 System.out.println(strNumbers[i] + " : " + strNumbers[i+1]);
		    	 System.out.println(s1 + " : " + s2);
		    	 //양수이면 s1이 더 큰거, 음수이면 s2가 더 큰거
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
