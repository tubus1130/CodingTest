import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int B = sc.nextInt();
		int digit = 1;
		int result = 0;
		for(int i=N.length()-1; i>=0; i--) {
			if(N.charAt(i) >= 65 && N.charAt(i) <= 97) {
				result += (N.charAt(i) - 55) * digit;
			}else {
				result += (N.charAt(i) - 48) * digit;
			}
			digit *= B;
		}
		System.out.println(result);
	}
}
