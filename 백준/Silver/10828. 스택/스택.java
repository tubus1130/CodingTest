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
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			
			String ans = st.nextToken();
			switch(ans) {
			case "push":
				int temp = Integer.parseInt(st.nextToken());
				stack.add(temp);
				break;
			case "pop":
				if(stack.isEmpty()) {
					sb.append("-1\n");
				}else {
					sb.append(stack.pop() + "\n");					
				}
				break;
			case "size":
				sb.append(stack.size() + "\n");
				break;
			case "empty":
				if(stack.isEmpty()) {
					sb.append("1\n");
				}else {
					sb.append("0\n");
				}
				break;
			case "top":
				if(stack.isEmpty()) {
					sb.append("-1\n");
				}else {
					sb.append(stack.peek() + "\n");
				}
				break;
			}
			
					
		}
		System.out.println(sb);
		
		
		
		
	}
}