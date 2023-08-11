import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		Stack<Integer> stack = new Stack<>();
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			switch(num) {
			case 1:
				stack.add(Integer.parseInt(st.nextToken()));
				break;
			case 2:
				if(!stack.isEmpty()) {
					bw.append(stack.pop() + "\n");
				}else {
					bw.append("-1\n");
				}
				break;
			case 3:
				bw.append(stack.size() + "\n");
				break;
			case 4:
				if(stack.isEmpty()) {
					bw.append("1\n");
				}else {
					bw.append("0\n");
				}
				break;
			case 5:
				if(!stack.isEmpty()) {
					bw.append(stack.peek() + "\n");
				}else {
					bw.append("-1\n");
				}
				break;
			}
		}
		
		bw.flush();
	}

}