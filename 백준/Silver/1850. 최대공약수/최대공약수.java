import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		long A = sc.nextLong();
		long B = sc.nextLong();
		
		long temp = gcd(A, B);
		
		for(long i=0; i<temp; i++) {
			sb.append("1");
		}
		System.out.println(sb);
	}

	private static long gcd(long a, long b) {
		if(b == 0) {
			return a;
		}else {
			return gcd(b, a%b);
		}
	}
}