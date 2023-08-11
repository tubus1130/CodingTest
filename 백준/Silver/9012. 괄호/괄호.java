import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			Stack<Character> stack = new Stack<>();
			char[] arr = br.readLine().toCharArray();
			for(int j=0; j<arr.length; j++) {
				if(arr[j] == '(') {
					stack.add(arr[j]);
				}else {
					if(stack.isEmpty() || stack.peek() == ')') {
						bw.append("NO\n");
						break;
					}else {
						stack.pop();
					}
				}
				if(j == arr.length-1 && stack.isEmpty()) {
					bw.append("YES\n");
				}
			}
			if(!stack.isEmpty()) {
				bw.append("NO\n");
			}
			
		}
		bw.flush();
	}

}
