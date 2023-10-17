import java.io.IOException;
import java.util.*;
public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long sum = 0;
		for(int i=1; i<=n; i++) {
			sum += (n/i) * i;
		}
		System.out.println(sum);
		
	}
	
}