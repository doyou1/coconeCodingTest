package vo;

public class SortTest {

	public static void main(String[] args) {
		
		int[] arr = {9,6,7,3,5};
					//0 1 2 3 4
		//1ȸ���� �ϸ� ���� ���� ���� ù��°�� ��ġ�ϰ� ��
		
		for(int i=0;i<arr.length-1; i++) {
			
			int index = i;
			
			for(int j=i+1;j<arr.length; j++) {
				if(arr[j]<arr[index]) {
					index = j;
				}
			}
			System.out.println("index : " + index);
			if(i != index) {
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
			}
		}
		
		for(int num : arr) {
			System.out.println(num);
		}
	}
}