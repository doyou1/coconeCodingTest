package vo;

public class GugudanTest {

	
	public static void main(String[] args) {
		
		
		int[][] a = new int[5][5];
		
		
		int[][] b = new int[5][5];
		
		int cnt = 0;
		for(int i=0;i<a.length; i++) {
			for(int j=0;j<a[i].length; j++) {
				a[i][j] = ++cnt;

				//a[0][0] = 1
				//a[0][1] = 2
				//a[0][2] = 3
				//a[0][3] = 4
				//a[0][4] = 5
				//a[1][0] = 6
				//a[1][1] = 7

				//a[4][4] = 25
			}
		}

		//2�����迭
		//{
		//	{1,2,3,4,5}		//0  i
		//,{6,7,8,9,10}		//1
		//,{11,12,13,14,15} //2
		//,{16,17,18,19,20} //3 
		//,{21,22,23,24,25} //4
		//}
		//21 16 11 6 1
		//22 17 12 7 2
		//23 18 13 8 3
		//21 : a[4][0]
		
		/*
		 * {
		 * 	{21,16,11,6,1}
		 * ,{22,17,12,7,2}
		 * ,{23,18,13,8,3}
		 * ,{24,}
		 * }
		 * */
		for(int i=0;i<b.length; i++) {
			for(int j=0;j<b[i].length; j++) {
				b[i][j] = a[4-j][i];
			}
		}
		
		for(int i=0;i<b.length; i++) {
			for(int j=0;j<b[i].length; j++) {
				System.out.println(b[i][j]);
			}
		}
		
		
		
		
	}
	
	
}
