import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		int arr[] = new int[N];
		int cnt[] = new int[1000001];
		int result[] = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			int temp = Integer.parseInt(st.nextToken());
			arr[i] = temp;
			cnt[temp]++;
		}
		
		Stack<Integer> stack = new Stack<>();
		for(int i=0; i<N; i++) {
			if(stack.isEmpty()) {
				stack.push(i);
				continue;
			}
			
			if(cnt[arr[stack.peek()]] >= cnt[arr[i]]) {
				stack.push(i);
			}else {
				while(!stack.isEmpty() && (cnt[arr[stack.peek()]] < cnt[arr[i]])) {
					result[stack.peek()] = arr[i];
					stack.pop();
				}
				stack.push(i);
			}
		}
		
		while(!stack.isEmpty()) {
			result[stack.pop()] = -1;
		}
		
		for(int i=0; i<N; i++) {
			sb.append(result[i] + " ");
		}
		
		System.out.println(sb);
	}
}