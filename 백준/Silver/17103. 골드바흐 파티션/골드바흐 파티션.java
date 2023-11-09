import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		
		int[] arr = new int[1000001];
		for(int i=0; i<arr.length; i++) {
			arr[i] = i;
		}
		
		for(int i=2; i<Math.sqrt(arr.length); i++) {
			if(arr[i] == 0) {
				continue;
			}
			for(int j=i+i; j<arr.length; j+=i) {
				arr[j] = 0;
			}
		}
		
		for(int i=0; i<T; i++) {
			int N = Integer.parseInt(br.readLine());
			int cnt = 0;
			for(int j=2; j<=N/2; j++) {
				if(arr[j] != 0 && arr[N-j] != 0) {
					cnt++;
				}
			}
			sb.append(cnt + "\n");
		}
		System.out.println(sb);
	}
}
