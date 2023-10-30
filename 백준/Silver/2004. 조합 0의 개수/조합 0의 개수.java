import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		System.out.println(Math.min(divide5(n) - (divide5(m) + divide5(n-m)), divide2(n) - (divide2(m) + divide2(n-m))));
		
		
	}
	
	public static int divide5(int num) {
		int cnt = 0;
		while(num >= 5) {
			cnt += num/5;
			num /= 5;
		}
		return cnt;
	}
	
	public static int divide2(int num) {
		int cnt = 0;
		while(num >= 2) {
			cnt += num/2;
			num /= 2;
		}
		return cnt;
	}
}