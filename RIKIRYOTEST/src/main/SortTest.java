package main;

public class SortTest {

	
	
	public static void main(String[] args) {
		
		int[] willBubble = {8,6,5,3,5,1};

		int[] willSelect = {5,3,6,3,2,8};
		
		
		SortTest st = new SortTest();
		
		System.out.println("�������Ľ���");
		st.printArr(willBubble);// 8 6 5 3 5 1 
		
		st.bubble(willBubble);
		
		st.printArr(willBubble);//1 3 5 5 6 8
		
		System.out.println("�������ĳ�");
		
		System.out.println("�������Ľ���");
		st.printArr(willSelect);
		
		st.select(willSelect);
		
		st.printArr(willSelect);
		System.out.println("�������ĳ�");
		
		
	}

	
	public void bubble(int[] arr) {
		//{8,6,5,3,5,1}
		//6�� ������
		for(int i=0;i<arr.length-1;i++) {
		
			for(int j=0;j<arr.length-1;j++) {
				int x = arr[j];
				System.out.println("x��?" + x);
				int y = arr[j+1];
				
				if(x >= y) {
					arr[j] = y;
					arr[j+1] = x;
				}
				
			}
			System.out.println((i+1) + "ȸ��");
			for(int n : arr) {
				System.out.print(n + " ");
			}
			System.out.println();
			
		}
	}
	
	public void select(int[] arr) {
		
		for(int i=0; i<arr.length-1;i++) {
			int select1 = arr[i];
			int index = 0;
			for(int j=i+1;j<arr.length;j++) {
				int select2 = arr[j];
				
				if(select1 > select2) {
					select1 = select2;
					index = j;
				}
			}
			
			if(index != 0) {
				//ū �� �����
				arr[index] = arr[i];
				arr[i] = select1;		
			}
			System.out.println((i+1) + "ȸ��");
			printArr(arr);
		}
		
	}
	
	public void printArr(int[] arr) {
		System.out.println("=======================");
		for(int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println("=======================");
	}
}
