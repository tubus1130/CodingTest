import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long A = sc.nextInt();
		int B = sc.nextInt();
		long C = sc.nextInt();
		int D = sc.nextInt();
		
		int digit1 = getDigit(B);
		int digit2 = getDigit(D);
		
		A = (long) (A * Math.pow(10, digit1));
		C = (long) (C * Math.pow(10, digit2));
		
		System.out.println(A + B + C + D);
	}
	
	public static int getDigit(int num) {
		int digit = 0;
		while(num > 0) {
			num /= 10;
			digit++;
		}
		
		return digit;
	}
}