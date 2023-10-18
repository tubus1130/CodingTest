import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i=1; i<=N; i++) {
			queue.add(i);
		}
		
		sb.append("<");
		
		while(!queue.isEmpty()) {
			for(int i=0; i<K-1; i++) {
				queue.add(queue.poll());
			}
			if(queue.size() != 1) {
				sb.append(queue.poll() + ", ");				
			}else {
				sb.append(queue.poll() + ">");	
			}
		}
		System.out.println(sb);
	}
}