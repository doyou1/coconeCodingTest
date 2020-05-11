package study0415;

public class Solution1 {
/*구름이는 계단을 올라가고 있다. 구름이는 계단을 
 * 최대 2칸 오를 수 있다고 할 때 계단을 오르는 방법의 가짓수를 출력하는 프로그램을 작성하십시오.

n이 3인 경우를 예로들면

1. 1 - 2 - 3

2. 1 - 3

3. 2 - 3

이렇게 3 가지 방식이 가능하다. (구름이는 0에서 계단 오르는 것을 시작한다.)

입력
n 은 30 이하의 양의 정수이다.

출력
오를 수 있는 가짓 수를 출력한다*/
	
	static int classN = 10;
	static int classCount = 0;
	
	public static void main(String[] args) {
		int n = 10;//계단이 10개
		classN = n;
		Solution1 s1 = new Solution1();
		s1.solution();
	}
	
	public void solution() {
		
		callback(1);
		//이 함수가 몇번 불러졌는지 classCount
		System.out.println(classCount);
	}
	
	public void callback(int temp) {
		
		if(temp >= classN) {
			classCount += 1;
		}else{
			//한칸 가는 경우
			callback(temp+1);
			//두칸 가는 경우
			callback(temp+2);
		}
		
	}
}
