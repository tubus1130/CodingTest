import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0; i<t; i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();
			
			int a = n % h;
			if(a == 0) {
				a = h;
			}
			int b = n / h + 1;
			if(n % h == 0) {
				b = n/h;
			}
			int result = a*100 + b;
			
			System.out.println(result);
		}
	}
	
}
