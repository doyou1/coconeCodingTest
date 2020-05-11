package study0414;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Solution1 {
/*
 * 문제
한 개의 회의실이 있는데 이를 사용하고자 하는 N개의 회의에 대하여 회의실 사용표를 만들려고 한다. 각 회의 I에 대해 시작시간과 끝나는 시간이 주어져 있고, 각 회의가 겹치지 않게 하면서 회의실을 사용할 수 있는 회의의 최대 개수를 찾아보자. 단, 회의는 한번 시작하면 중간에 중단될 수 없으며 한 회의가 끝나는 것과 동시에 다음 회의가 시작될 수 있다. 회의의 시작시간과 끝나는 시간이 같을 수도 있다. 이 경우에는 시작하자마자 끝나는 것으로 생각하면 된다.

입력
첫째 줄에 회의의 수 N(1 ≤ N ≤ 100,000)이 주어진다. 둘째 줄부터 N+1 줄까지 각 회의의 정보가 주어지는데 이것은 공백을 사이에 두고 회의의 시작시간과 끝나는 시간이 주어진다. 시작 시간과 끝나는 시간은 231-1보다 작거나 같은 자연수 또는 0이다.

출력
첫째 줄에 최대 사용할 수 있는 회의의 최대 개수를 출력한다.

예제 입력 1 
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
				//index 0은 시작시간
				//index 1은 종료시간
				/*if(a1[1] == a2[1]) {
					System.out.println("a1[1] : " + a1[1] + ", a2[1] : " + a2[1]);
					//만약 비교하는 값의 종료시간이 같을 경우 시작시간으로 정렬함
					return a1[0] > a2[0] ? 1 : -1;
				}*/

				System.out.println("a1[0] : " + a1[0] + ", a1[1] : " + a1[1]);
				System.out.println("a2[0] : " + a2[0] + ", a2[1] : " + a2[1]);
				System.out.println("========================================");
				//종료시간으로 오름차순 정렬
				//return 값이 양수면 위치가 바뀝니다!
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
		
		int count = 0;	//최대값 변수
		int end = -1;	// 다음시작 시간과 비교할 변수
		
		for(int i=0;i<roomCnt;i++) {
			
			//현재 시작시간이 이전 종료시간보다 늦을 경우
			if(arr[i][0] >= end) {
				end = arr[i][1]; //현재 종료시간을 다음 시작시간과 비교하기 위해 저장
				count++;
			}
		}
				
		System.out.println(count);
	}
}
