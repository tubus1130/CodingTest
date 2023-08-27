import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[2][N];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[0][i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[1][i] = Integer.parseInt(st.nextToken());
		}
		
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i=arr[0].length-1; i>=0; i--) {
			if(arr[0][i] == 0) {
				queue.add(arr[1][i]);
			}
		}
		
		int M = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		
		while(st.hasMoreTokens()) {
			queue.add(Integer.parseInt(st.nextToken()));
			sb.append(queue.poll() + " ");
		}
		
		System.out.println(sb.toString());
	}

}
