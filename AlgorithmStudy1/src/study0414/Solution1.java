package study0414;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Solution1 {
/*
 * ����
�� ���� ȸ�ǽ��� �ִµ� �̸� ����ϰ��� �ϴ� N���� ȸ�ǿ� ���Ͽ� ȸ�ǽ� ���ǥ�� ������� �Ѵ�. �� ȸ�� I�� ���� ���۽ð��� ������ �ð��� �־��� �ְ�, �� ȸ�ǰ� ��ġ�� �ʰ� �ϸ鼭 ȸ�ǽ��� ����� �� �ִ� ȸ���� �ִ� ������ ã�ƺ���. ��, ȸ�Ǵ� �ѹ� �����ϸ� �߰��� �ߴܵ� �� ������ �� ȸ�ǰ� ������ �Ͱ� ���ÿ� ���� ȸ�ǰ� ���۵� �� �ִ�. ȸ���� ���۽ð��� ������ �ð��� ���� ���� �ִ�. �� ��쿡�� �������ڸ��� ������ ������ �����ϸ� �ȴ�.

�Է�
ù° �ٿ� ȸ���� �� N(1 �� N �� 100,000)�� �־�����. ��° �ٺ��� N+1 �ٱ��� �� ȸ���� ������ �־����µ� �̰��� ������ ���̿� �ΰ� ȸ���� ���۽ð��� ������ �ð��� �־�����. ���� �ð��� ������ �ð��� 231-1���� �۰ų� ���� �ڿ��� �Ǵ� 0�̴�.

���
ù° �ٿ� �ִ� ����� �� �ִ� ȸ���� �ִ� ������ ����Ѵ�.

���� �Է� 1 
11
1 4
3 5
0 6
5 7
3 8
5 9
6 10
8 11
8 12
2 13
12 14
 * */	
	
	public static void main(String[] args) {
		
		int roomCnt = 11;
		ArrayList<String> roomUseTime = new ArrayList<>();
		roomUseTime.add("1 4");
		roomUseTime.add("3 5");
		roomUseTime.add("0 6");
		roomUseTime.add("5 7");
		roomUseTime.add("3 8");
		roomUseTime.add("5 9");
		roomUseTime.add("6 10");
		roomUseTime.add("8 11");
		roomUseTime.add("8 12");
		roomUseTime.add("2 13");
		roomUseTime.add("12 14");
		
		int[][] arr = new int[roomCnt][2];
		
		for(int i=0;i<roomCnt;i++) {
			arr[i][0] = Integer.parseInt(roomUseTime.get(i).split(" ")[0]);
			arr[i][1] = Integer.parseInt(roomUseTime.get(i).split(" ")[1]);
		}
		
		for(int i=0;i<arr.length;i++) {
			int[] temp = arr[i];
			
			for(int j : temp) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		System.out.println("=======================");
		
		Arrays.sort(arr,new Comparator<int[]>() {	
			@Override
			public int compare(int[] a1, int[] a2) {
				//index 0�� ���۽ð�
				//index 1�� ����ð�
				/*if(a1[1] == a2[1]) {
					System.out.println("a1[1] : " + a1[1] + ", a2[1] : " + a2[1]);
					//���� ���ϴ� ���� ����ð��� ���� ��� ���۽ð����� ������
					return a1[0] > a2[0] ? 1 : -1;
				}*/

				System.out.println("a1[0] : " + a1[0] + ", a1[1] : " + a1[1]);
				System.out.println("a2[0] : " + a2[0] + ", a2[1] : " + a2[1]);
				System.out.println("========================================");
				//����ð����� �������� ����
				//return ���� ����� ��ġ�� �ٲ�ϴ�!
				return a1[1] > a2[1] ? 1 : -1;
			}
		});
		
		for(int i=0;i<arr.length;i++) {
			int[] temp = arr[i];
			
			for(int j : temp) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		int count = 0;	//�ִ밪 ����
		int end = -1;	// �������� �ð��� ���� ����
		
		for(int i=0;i<roomCnt;i++) {
			
			//���� ���۽ð��� ���� ����ð����� ���� ���
			if(arr[i][0] >= end) {
				end = arr[i][1]; //���� ����ð��� ���� ���۽ð��� ���ϱ� ���� ����
				count++;
			}
		}
				
		System.out.println(count);
	}
}
