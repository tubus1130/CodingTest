import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		Deque<Integer> deque = new LinkedList<>();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			String control = st.nextToken();
			int temp = 0;
			
			switch(control) {
			case "push_front":
				temp = Integer.parseInt(st.nextToken());
				deque.addFirst(temp);
				break;
			case "push_back":
				temp = Integer.parseInt(st.nextToken());
				deque.addLast(temp);
				break;
			case "pop_front":
				if(!deque.isEmpty()) {
					sb.append(deque.pollFirst() + "\n");
				}else {
					sb.append("-1\n");
				}
				break;
			case "pop_back":
				if(!deque.isEmpty()) {
					sb.append(deque.pollLast() + "\n");
				}else {
					sb.append("-1\n");
				}
				break;
			case "size":
				sb.append(deque.size() + "\n");
				break;
			case "empty":
				if(deque.isEmpty()) {
					sb.append("1\n");
				}else {
					sb.append("0\n");
				}
				break;
			case "front":
				if(!deque.isEmpty()) {
					sb.append(deque.peekFirst() + "\n");
				}else {
					sb.append("-1\n");
				}
				break;
			case "back":
				if(!deque.isEmpty()) {
					sb.append(deque.peekLast() + "\n");
				}else {
					sb.append("-1\n");
				}
				break;
			}
		}
		System.out.println(sb);
	}
}