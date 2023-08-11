import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[] A = new int[n]; // 수열배열
		int[] ans = new int[n]; // 정답배열
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		Stack<Integer> myStack = new Stack<>();
		
		myStack.push(0);
		
		for(int i=1; i<n; i++) {
			while(!myStack.isEmpty() && A[myStack.peek()] < A[i]) {
				ans[myStack.pop()] = A[i];
			}
			myStack.push(i);
		}
		
		while(!myStack.isEmpty()) {
			ans[myStack.pop()] = -1;
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=0; i<n; i++) {
			bw.write(ans[i] + " ");
		}
		bw.flush();
	}

}
