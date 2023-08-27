import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		
		Stack<Integer> stack = new Stack<>();
		
		int idx = 1;
		
		while(st.hasMoreTokens()) {
			if(stack.isEmpty()) {
				stack.push(Integer.parseInt(st.nextToken()));
			}
			if(stack.peek() == idx) {
				stack.pop();
				idx++;
			}else {
				stack.push(Integer.parseInt(st.nextToken()));
			}
		}
		if(stack.isEmpty()) {
			System.out.println("Nice");
		}
		
		while(!stack.isEmpty()) {
			if(stack.peek() == idx) {
				stack.pop();
				idx++;
			}else {
				System.out.println("Sad");
				break;
			}
			if(idx == N+1) {
				System.out.println("Nice");
				break;
			}
		}
	}

}
