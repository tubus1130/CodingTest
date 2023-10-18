import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
	
	public static void main(String[] args) throws IOException{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<>();
		
		int now = 1;
		stack.add(now);
		sb.append("+\n");
		for(int i=0; i<N; i++) {
			int target = Integer.parseInt(br.readLine());
			if(stack.isEmpty()) {
				stack.add(++now);
				sb.append("+\n");
			}
			if(stack.peek() < target) {
				while(stack.peek() != target) {
					stack.add(++now);
					sb.append("+\n");
				}
			}
			if(stack.peek() > target) {
				System.out.println("NO");
				break;
			}
			if(stack.peek() == target){
				stack.pop();
				sb.append("-\n");
			}
		}
		if(stack.isEmpty()) {
			System.out.println(sb);
		}
		
	}
}