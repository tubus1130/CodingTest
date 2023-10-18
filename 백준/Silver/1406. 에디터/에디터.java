import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		String first = br.readLine();
		
		Stack<Character> lstack = new Stack<>();
		Stack<Character> rstack = new Stack<>();
		for(int i=0; i<first.length(); i++) {
			lstack.add(first.charAt(i));
		}
		
		int loop = Integer.parseInt(br.readLine());
		
		for(int i=0; i<loop; i++) {
			st = new StringTokenizer(br.readLine());
			String control = st.nextToken();
			switch(control) {
			case "L":
				if(!lstack.isEmpty()) {
					rstack.add(lstack.pop());					
				}
				break;
			case "D":
				if(!rstack.isEmpty()) {
					lstack.add(rstack.pop());
				}
				break;
			case "B":
				if(!lstack.isEmpty()) {
					lstack.pop();
				}
				break;
			case "P":
				String data = st.nextToken();
				lstack.add(data.charAt(0));
				break;
			}
		}
		
		while(!lstack.isEmpty()) {
			rstack.add(lstack.pop());
		}
		while(!rstack.isEmpty()) {
			sb.append(rstack.pop());
		}
		System.out.println(sb);
		
	}
	
}
