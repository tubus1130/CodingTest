import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int temp = 0;
		int A[] = new int[1000001];
		for(int i=2; i<1000000; i++) {
			A[i] = i;
		}
		
		for(int i=2; i<=Math.sqrt(1000000); i++) {
			if(A[i] == 0) {
				continue;
			}
			for(int j=i+i; j<=1000000; j+=i) {
				A[j] = 0;
			}
		}
		
		while(true) {
			temp = Integer.parseInt(br.readLine());
			if(temp == 0) {
				break;
			}
			for(int i=3; i<=temp/2; i++) {
				if(A[i] != 0 && A[temp-i] != 0) {
					sb.append(temp + " = " + i + " + " + (temp-i) + "\n");
					break;
				}
				if(i==(temp-1)) {
					sb.append("Goldbach's conjecture is wrong.\n");
					break;
				}
			}
		}
		System.out.println(sb);
		
		
	}
}