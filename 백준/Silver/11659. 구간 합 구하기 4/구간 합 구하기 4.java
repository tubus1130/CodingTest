import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] totalLog = new int[M];
		
		int[] arr = new int[N];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int[] sArr = new int[N];
		sArr[0] = arr[0];

		for(int i=1; i<sArr.length; i++) {
			sArr[i] = sArr[i-1] + arr[i]; 
		}
		
		for(int k=0; k<M; k++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			if(i <= 1) {
				totalLog[k] = sArr[j-1];
			}else {
				totalLog[k] = sArr[j-1] - sArr[i-2];
			}
		}
		
		for(int i=0; i<totalLog.length; i++) {
			System.out.println(totalLog[i]);
		}
		
	}

}
