package study0413;

public class Solution2 {
/*
 * H-Index는 과학자의 생산성과 영향력을 나타내는 지표입니다. 어느 과학자의 H-Index를 나타내는 값인 h를 구하려고 합니다. 위키백과1에 따르면, H-Index는 다음과 같이 구합니다.

어떤 과학자가 발표한 논문 n편 중, h번 이상 인용된 논문이 h편 이상이고 나머지 논문이 h번 이하 인용되었다면 h의 최댓값이 이 과학자의 H-Index입니다.

어떤 과학자가 발표한 논문의 인용 횟수를 담은 배열 citations가 매개변수로 주어질 때, 이 과학자의 H-Index를 return 하도록 solution 함수를 작성해주세요.
 * */
	
	
	public static void main(String[] args) {
		Solution2 s2 = new Solution2();
		
		int[] citations = {3,0,6,1,5};
		
		int answer = s2.solution(citations);
		
		System.out.println(answer);
	}
	
	 public int solution(int[] citations) {
	     
		 //가장 큰 인용수 찾기
		 int bestCheck = 0;
		 for(int i=0; i<citations.length;i++) {
			 if(bestCheck < citations[i]) {
				 bestCheck = citations[i];
			 }
		 }
		 

		 //맨앞은 최대, 맨뒤는 최소

	 	int answer = 0;
		//0부터 가장 큰 인용수까지 for문
	 	for(int j=0; j<=bestCheck;j++) {
			 
			 int cnt = 0;
			 //각각 논문의 인용수가 특정 인용수보다 크거나 같으면 cnt를 플러스1 하고
			 for(int k=0; k<citations.length;k++) {
				 if(citations[k] >= j) {
					 cnt++;
				 }
			 }
			 
			 //for문을 전부 돌렸을 때 cnt가 특정 인용수 보다 크거나 같으면 H-Index가 될 수 있음
			 //최대한 어디까지 그렇게 될 수 있는지를 확인
			 if(j <= cnt) {
				 answer = j;
			 }else {
				 break;
			 }
		 }
		 
	 	//정렬했으면 최대값 바로 찾을 수 있었다
	 	
		System.out.println(answer);
		 
	        return answer;
	    }
}
