import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		char[] arr = br.readLine().toCharArray();
		
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] >= 'A' && arr[i] <= 'Z') {
				sb.append(arr[i]);
			}else {
				if(arr[i] == '(') {
					stack.push('(');
				}else if(arr[i] == ')') {
					while(!stack.isEmpty() && stack.peek() != '(') {
						sb.append(stack.pop());
					}
					stack.pop();
				}else {
					while(!stack.isEmpty() && compare(stack.peek()) >= compare(arr[i])) {
						sb.append(stack.pop());
					}
					stack.push(arr[i]);
				}
			}
		}
		
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		
		System.out.println(sb);
		
	}
	
	public static int compare(char c) {
		if(c == '*' || c == '/') {
			return 2;
		}else if(c == '+' || c == '-') {
			return 1;
		}else {
			return 0;
		}
	}
}