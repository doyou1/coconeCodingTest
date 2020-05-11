package study0413;

public class Callback {

	public static void main(String[] args) {
		
		Callback cb = new Callback();
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		int index = 0;
		cb.sumFunc(arr,index,sum);
		
		int num = 5;
		sum = 1;
		cb.factFunc(num, sum);
	}
	
	//전체 더하는 재귀함수
	public void sumFunc(int[] arr, int index, int sum) {

		//종료조건문
		if(index == arr.length) {
			System.out.println(sum);
			return;
		}
		
		//동작조건문
		sum += arr[index];
		
		//재귀호출
		sumFunc(arr, index+1, sum);
	}
	
	//팩토리얼 재귀함수
	public void factFunc(int num, int sum) {
		
		if(num == 0) {
			System.out.println(sum);
			return;
		}
		
		//1*2*3*4*5
		sum *= num;
		
		factFunc(num-1,sum);
		
	}
}

