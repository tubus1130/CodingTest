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
		
		Stack<Character> stack; 
		char[] arr;
		for(int i=0; i<N; i++) {
			stack = new Stack<>();
			st = new StringTokenizer(br.readLine());
			arr = st.nextToken().toCharArray();
			int j;
			for(j=0; j<arr.length; j++) {
				if(arr[j] == '(') {
					stack.add('(');
				}else {
					if(stack.isEmpty()) {
						sb.append("NO\n");
						break;
					}else {
						stack.pop();
					}
				}
			}
			if(j == arr.length) {
				if(stack.isEmpty()) {
					sb.append("YES\n");
				}else {
					sb.append("NO\n");
				}
			}
		}
		System.out.println(sb);
		
	}
}