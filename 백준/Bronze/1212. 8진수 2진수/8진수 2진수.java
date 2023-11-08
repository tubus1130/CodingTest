import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String N = br.readLine();
		int digit = 0;
		int target = N.charAt(0) - '0';
		digit = 1;
		int temp = 0;
		while(target > 0) {
			temp += (target % 2) * digit;
			target /= 2;
			digit *= 10;
		}
		sb.append(temp);
		
		for(int i=1; i<N.length(); i++) {
			target = N.charAt(i) - '0';
			digit = 1;
			temp = 0;
			while(target > 0) {
				temp += (target % 2) * digit;
				target /= 2;
				digit *= 10;
			}
			if(temp / 100 != 0) {
				sb.append(temp);
			}else if(temp / 10 != 0) {
				sb.append("0" + temp);
			}else {
				sb.append("00" + temp);
			}
		}
		
		System.out.println(sb);
	}
}
