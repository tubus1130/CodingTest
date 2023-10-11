static boolean[] visited = new boolean[9];
static int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};
public static void main(String[] args){	
	dfs(1);
}

static void dfs(int nodeIndex) {
	// 방문 처리
	visited[nodeIndex] = true;
	
	// 방문한 노드에 인접한 노드 찾기
	for (int node : graph[nodeIndex]) {
		// 인접한 노드가 방문한 적이 없다면 DFS 수행
		if(!visited[node]) {
			dfs(node);
		}
	}
}
