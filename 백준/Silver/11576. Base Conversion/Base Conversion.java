import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int m = Integer.parseInt(br.readLine());
		
		int num10 = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i=m-1; i>=0; i--) {
			num10 += Integer.parseInt(st.nextToken()) * Math.pow(A, i);
		}
		
		if(num10 == 0) {
			sb.append(0);
		}
		
		Stack<Integer> stack = new Stack<>();
		
		while(num10 > 0) {
			stack.push(num10 % B);
			num10 /= B;
		}
		
		while(!stack.isEmpty()) {
			sb.append(stack.pop() + " ");
		}
		System.out.println(sb);
	}
}
