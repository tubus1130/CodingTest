import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
 
		int two = 0;
		int five = 0;
		for (int i = 1; i <= N; i++) {
			int n = i;
			
			while (n % 2 == 0) {	// 2 개수 세기
				two++;
				n /= 2;
			}
			
			while (n % 5 == 0) {	// 5 개수 세기
				five++;
				n /= 5;
			}
		}
		
		// 2와 5로 만들 수 있는 10의 개수
		System.out.println(five < two ? five : two);
	}
 
}