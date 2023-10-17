import java.util.*;
public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int temp;
		if(a < b) {
			temp = a;
			a = b;
			b = temp;
		}
		
		for(int i=b; i>0; i--) {
			if(a % i == 0 && b % i == 0) {
				System.out.println(i);
				break;
			}
		}
		
		for(long i=a; ;i+=a) {
			if(i % a == 0 && i % b == 0) {
				System.out.println(i);
				break;
			}
		}
		
	}
}