import java.io.IOException;
import java.util.*;
public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int n = sc.nextInt();
			int sum = 1;
			int digit = 1;
			while(sum % n != 0) {
				sum = ((sum * 10) + 1) % n;
				digit++;
			}
			System.out.println(digit);
		}
	}
	
}