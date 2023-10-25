import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a < b) {
				int temp = a;
				a = b;
				b = temp;
			}
			
			for(int j=b; ; j+=b) {
				if((j % a == 0) && (j % b == 0)) {
					System.out.println(j);
					break;
				}
			}
		}
	}
}