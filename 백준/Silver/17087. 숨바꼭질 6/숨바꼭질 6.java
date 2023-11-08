import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long N = Long.parseLong(st.nextToken());
		long S = Long.parseLong(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		long num1 = Long.parseLong(st.nextToken());
		
		num1 = Math.abs(num1 - S);
		
		long result = num1;
		
		while(st.hasMoreTokens()) {
			long temp = Long.parseLong(st.nextToken());
			temp = Math.abs(temp - S);
			result = gcd(result, temp);
		}
		
		System.out.println(result);
	}

	private static long gcd(long a, long b) {
		if(b == 0) {
			return a;
		}else {
			return gcd(b, a%b);
		}
	}
}