package cocone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GreedTest7_cantsolve {


	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int[] arr = new int[3];
		int cnt = 0;
		while(st.hasMoreTokens()) {
			arr[cnt++] = Integer.valueOf(st.nextToken());
		}
		
		int n = arr[0];
		int m = arr[1];
		int k = arr[2];

		int team = 0;
		while(n >= 2 && m >= 1 && n + m >= 3 + k) {
			n -= 2;
			m--;
			team++;
		}
		System.out.println(team);
	}
}