import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String temp = br.readLine();
		
		for(int i=0; i<temp.length(); i++) {
			char target = temp.charAt(i);
			if((target >= 'A' && target <= 'M') || (target >= 'a' && target <= 'm')) {
				target += 13;
			}else if((target >= 'N' && target <= 'Z') || (target >= 'n' && target <= 'z')) {
				target -= 13;
			}
			sb.append(target);
		}
		System.out.println(sb);
	}
}