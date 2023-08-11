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
		 * 3 1 4 2 5
		 * 3 1 4 2 5
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = i+1;
		}
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int temp = arr[a-1];
			arr[a-1] = arr[b-1];
			arr[b-1] = temp;
		}
		
		for(int i=0; i<N; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}