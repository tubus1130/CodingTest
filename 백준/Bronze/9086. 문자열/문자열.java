import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
			String temp = sc.next();
			String answer = "";
			answer += temp.charAt(0);
			answer += temp.charAt(temp.length()-1);
			System.out.println(answer);
		}
	}
}