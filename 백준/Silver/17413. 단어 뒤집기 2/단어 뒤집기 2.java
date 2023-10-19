import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
	
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		boolean flag = false;
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) == '<') {
				flag = true;
				isEmpty(stack);
				sb.append(input.charAt(i));
			}else if(input.charAt(i) == '>') {
				flag = false;
				sb.append(input.charAt(i));
			}else if(flag) {
				sb.append(input.charAt(i));
			}else if(!flag) {
				if(input.charAt(i) == ' ') {
					isEmpty(stack);
					sb.append(input.charAt(i));
				}else {
					stack.push(input.charAt(i));
				}
			}
		}
		
		isEmpty(stack);
		System.out.println(sb);
	}
	
	public static void isEmpty(Stack<Character> stack) {
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
	}
}