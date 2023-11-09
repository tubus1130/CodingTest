import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		int B = sc.nextInt();
		
		while(N>0) {
			int temp = N % B;
			if(temp >= 10) {
				sb.append((char)(temp+55));
			}else {
				sb.append(temp);
			}
			N /= B;
		}
		sb.reverse();
		System.out.println(sb);
	}
}
