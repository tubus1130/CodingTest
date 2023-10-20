import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String temp = "";
		while((temp = br.readLine()) != null) {
			int lower = 0;
			int upper = 0;
			int num = 0;
			int gap = 0;
			for(int i=0; i<temp.length(); i++) {
				if(temp.charAt(i) >= 'A' && temp.charAt(i) <= 'Z') {
					upper++;
				}else if(temp.charAt(i) >= 'a' && temp.charAt(i) <= 'z') {
					lower++;
				}else if(temp.charAt(i) == ' ') {
					gap++;
				}else {
					num++;
				}
			}
			sb.append(lower + " " + upper + " " + num + " " + gap + "\n");
		}
		
		
		System.out.println(sb);
	}
}