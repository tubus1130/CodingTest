import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		Queue<Integer> queue = new LinkedList<>();
		int N = Integer.parseInt(br.readLine());
		int rearNum = 0;
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			
			switch(command) {
			case "push":
				int temp = Integer.parseInt(st.nextToken());
				queue.add(temp);
				rearNum = temp;
				break;
			case "pop":
				if(!queue.isEmpty()) {
					sb.append(queue.poll() + "\n");
				}else {
					sb.append("-1\n");
				}
				break;
			case "size":
				sb.append(queue.size() + "\n");
				break;
			case "empty":
				if(queue.isEmpty()) {
					sb.append("1\n");
				}else {
					sb.append("0\n");
				}
				break;
			case "front":
				if(!queue.isEmpty()) {
					sb.append(queue.peek() + "\n");
				}else {
					sb.append("-1\n");
				}
				break;
			case "back":
				if(!queue.isEmpty()) {
					sb.append(rearNum + "\n");
				}else {
					sb.append("-1\n");
				}
			}
		}
		
		System.out.println(sb);
	}
}