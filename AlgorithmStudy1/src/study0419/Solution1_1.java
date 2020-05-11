package study0419;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution1_1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
	    Long n = Long.parseLong(br.readLine()) ;
	    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		Long[] arr = new Long[n.intValue()];
        
		int cnt = 0;
		while(st.hasMoreTokens()) {
				
			arr[cnt++] = Long.parseLong(st.nextToken());
		}
		Arrays.sort(arr);
		
	    int sum = 0;
		for(int i=0;i<n.intValue();i++) {
			for(int j=0;j<n.intValue();j++) {
				Long temp = arr[i] - arr[j];
				if(temp > 0) {
					sum += (arr[i] - arr[j]);
				}else if(temp == 0) {
					continue;
				}else {
					sum += (arr[j] - arr[i]);
				}

			}
		}
		
		System.out.println(sum);
		
		/*Scanner sc = new Scanner(System.in);
	    String n = sc.nextLine();
	    String str = sc.nextLine();
	    
	    String[] arr = str.split(" ");
		Arrays.sort(arr);
		int[][] input = new int[Integer.parseInt(n) * Integer.parseInt(n)][2];
		
		int cnt = 0;
		for(int i=0;i<Integer.parseInt(n);i++) {
			for(int j=0;j<Integer.parseInt(n);j++) {
				int x = Integer.parseInt(arr[i]);
				int y = Integer.parseInt(arr[j]);
				input[cnt] = new int[]{x,y};
				cnt++;
			}
		}
		
	    int sum = 0;
	    
	    for(int i=0;i<input.length;i++) {
			int[] a = input[i];
			int x = a[0];
			int y = a[1];
			
			sum += Math.abs(x-y);
		}		
		System.out.println(sum);
*/
	}
}
