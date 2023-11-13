import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		
		int[] arr = new int[10000001];
		for(int i=1; i<arr.length; i++) {
			arr[i] = i;
		}
		
		for(int i=2; i<=Math.sqrt(arr.length); i++) {
			if(arr[i] == 0) {
				continue;
			}
			for(int j=i+i; j<arr.length; j+=i) {
				arr[j] = 0;
			}
		}
		
		for(int i=2; i<=N; i++) {
			if(arr[i] != 0) {
				while(N%i==0) {
					sb.append(i + "\n");
					N /= i;
				}				
			}
			if(N == 1) {
				break;
			}
		}
		System.out.println(sb);
		
	}
}
