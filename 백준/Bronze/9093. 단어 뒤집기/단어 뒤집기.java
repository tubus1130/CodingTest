import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
	
	public static void main(String[] args) throws IOException{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		char arr[];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				String temp = st.nextToken();
				arr = temp.toCharArray();
				for(int j=arr.length-1; j>=0; j--) {
					sb.append(arr[j]);
				}
				sb.append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
		
	}
}