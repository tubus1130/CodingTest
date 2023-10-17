import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int cnt = 0;
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; i++) {
			int target = Integer.parseInt(st.nextToken());
			if(isPrime(target) && target >= 2) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}
	
	public static boolean isPrime(int n) {
		for(int i=2; i<n; i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
}