import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int answer = 1;
		
		if(N != 0) {
			for(int i=N; i>0; i--) {
				answer *= i;
			}
		}
		System.out.println(answer);
	}
}