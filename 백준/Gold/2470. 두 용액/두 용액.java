import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * 0
		 * 
		 * -99 -2 -1 4 98
		 * 
		 * -1
		 * -95
		 * 96
		 * 
		 * 
		 * -5 -2 1 4 7 9
		 * j를 왼쪽으로 옮기면 값이 더 작아짐
		 * i를 오른쪽으로 옮기면 값이 커짐
		 * 4
		 * 2
		 * -1
		 * 2
		 * 
		 * -10 -8 -5 -4 -3 -1
		 * j를 왼쪽으로 옮기면 값이 더 작아짐
		 * i를 오른쪽으로 옮기면 값이 커짐
		 * 
		 * 
		 * 1 3 4 6 7 9
		 * 
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		long[] arr = new long[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int i = 0;
		int j = N-1;
		long[] res = new long[2];
		long min = Integer.MAX_VALUE;
		long temp = 0;
		while(i < j) {
			temp = arr[i] + arr[j];
			if(min > Math.abs(temp)) {
				min = Math.abs(temp);
				res[0] = arr[i];
				res[1] = arr[j];
			}
			if(min == 0) {
				break;
			}
			if(temp > 0) {
				j--;
			}else {
				i++;
			}
		}
		/*
		 * -10 -8 -6 -4 -1
		 * 
		 * -9 -5 -2 1 6 7
		 * 
		 * 
		 * 
		 */
		
		System.out.println(res[0] + " " + res[1]);
	}
}
