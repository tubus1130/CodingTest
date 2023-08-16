import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] P = new int[N];
		for(int i=0; i<N; i++) {
			P[i] = sc.nextInt();
		}
		
		for(int i=1; i<P.length; i++) {
			int target = P[i];
			int j = i-1;
			while(j >= 0 && target <P[j]) {
				P[j+1] = P[j];
				j--;
			}
			P[j+1] = target;
		}
		
		int[] sum = new int[N];
		sum[0] = P[0];
		for(int i=1; i<N; i++) {
			sum[i] += sum[i-1] + P[i];
		}
		int total = 0;
		for(int i=0; i<sum.length; i++) {
			total += sum[i];
		}
		System.out.println(total);
		
		sc.close();
	}

}