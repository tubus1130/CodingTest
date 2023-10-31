import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		for(int i=0; i<t; i++) {
			long sum = 0;
			String[] str = br.readLine().split(" ");
			
			int temp = Integer.parseInt(str[0]);
			
			for(int j=1; j<str.length; j++) {
				for(int k = j+1; k<str.length; k++) {
					sum += gcd(Integer.parseInt(str[j]), Integer.parseInt(str[k]));
				}
			}
			sb.append(sum + "\n");
		}
		System.out.println(sb);
	}

	private static int gcd(int j, int k) {
		if(j < k) {
			int temp = j;
			j = k;
			k = temp;
		}
		for(int i=k; i>0; i--) {
			if(j%i==0 && k%i==0) {
				return i;
			}
		}
		
		return 1;
	}
	
}