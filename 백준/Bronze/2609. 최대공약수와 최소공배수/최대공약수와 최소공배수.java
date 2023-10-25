import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a < b) {
			int temp = a;
			a = b;
			b = temp;
		}
		
		// 최대공약수
		for(int i=b; i>0; i--) {
			if((a % i == 0) && (b % i == 0)) {
				System.out.println(i);
				break;
			}
		}
		
		// 최소공배수
		for(long i=a; ; i+=a) {
			if((i % a == 0) && (i % b == 0)) {
				System.out.println(i);
				break;
			}
		}
	}
}