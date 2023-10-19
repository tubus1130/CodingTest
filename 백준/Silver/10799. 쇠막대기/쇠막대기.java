import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		
		String temp = br.readLine();
		int cnt = 0;
		for(int i=0; i<temp.length(); i++) {
			if(temp.charAt(i) == '(') {
				stack.add(i);
			}else if(temp.charAt(i) == ')') {
				stack.pop();
				if(temp.charAt(i-1) == '(') {
					cnt += stack.size();
				}else {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
		
	}
}