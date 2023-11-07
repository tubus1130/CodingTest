import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine());
		for(int i=0; i<t; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(a < b) {
				int temp = a;
				a = b;
				b = temp;
			}
			
			int gcd = getGCD(a, b);
			System.out.println(a*b/gcd);
		}
	}

	private static int getGCD(int a, int b) {
		if(b == 0) {
			return a;
		}
		return getGCD(b, a%b);
		
	}
}
