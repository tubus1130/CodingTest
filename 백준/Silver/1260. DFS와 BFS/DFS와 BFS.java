import java.util.*;
public class Main {
	
	static ArrayList<Integer>[] A;
	static boolean visited[];
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int V = sc.nextInt();
		A = new ArrayList[N+1];
		visited = new boolean[N+1];
		
		for(int i=0; i<=N; i++) {
			A[i] = new ArrayList();
		}
		
		for(int i=0; i<M; i++) {
			int temp1 = sc.nextInt();
			int temp2 = sc.nextInt();
			A[temp1].add(temp2);
			A[temp2].add(temp1);
		}
		DFS(V);
		System.out.println();
		BFS(V);
		
	}
	
	public static void DFS(int Node) {
		System.out.print(Node + " ");
		visited[Node] = true;
		A[Node].sort(null);
		for(int i : A[Node]) {
			if(!visited[i]) {
				DFS(i);
			}
		}
		
	}
	
	public static void BFS(int Node) {
		Queue<Integer> queue = new LinkedList<>();
		for(int i=0; i<visited.length; i++) {
			visited[i] = false;
		}
		visited[Node] = true;
		queue.add(Node);
		while(!queue.isEmpty()) {
			Node = queue.peek();
			A[Node].sort(null);
			for(int i : A[Node]) {
				if(!visited[i]) {
					queue.add(i);
					visited[i] = true;
				}
			}
			System.out.print(queue.poll() + " ");			
			
		}
	}
	
}
