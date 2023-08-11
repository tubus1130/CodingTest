import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		/*
		 * 1 2 3 4 5
		 * 2 1 3 4 5
		 * 2 1 4 3 5
		 * 3 4 1 2 5
		 * 3 4 1 2 5
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		for(int i=0; i<N; i++){
			arr[i] = i+1;
		}
		
		for(int idx=0; idx<M; idx++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			while(i < j) {
				int temp = arr[i-1];
				arr[i-1] = arr[j-1];
				arr[j-1] = temp;
				i++;
				j--;
			}
		}
		for(int i=0; i<N; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}