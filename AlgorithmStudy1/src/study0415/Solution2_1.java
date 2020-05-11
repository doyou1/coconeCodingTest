package study0415;

public class Solution2_1 {

	public static void main(String[] args) {
		String num = "349533413 349533413";
		
		String[] numbers = num.split(" ");
		
		int begin = Integer.parseInt(numbers[0]);
		int end = Integer.parseInt(numbers[1]);
		
		int result = 0;
		if(begin != end) {
			result = 2;
		}else {
			for(int i=2;i<= (int) Math.sqrt(begin);i++) {
				if(begin%i==0) {
					result = i;
					break;
				}
			}
		}
		
		System.out.println(result);
	}
}
