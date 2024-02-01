'''
출발 지점에서 먼저 레버가 있는 칸으로 이동하여 레버를 당긴 후 미로를 빠져나가는 문이 있는 칸으로 이동

레버가 있는 방향을 인지해서 그쪽으로 나가야되는데

S와 L의 차이를 가지고 방향성을 결정해야될듯?
X축 : L-S > 0 오른쪽, < 0 왼쪽
Y축 : L-S > 0 아래쪽, < 0 위쪽
'''
from collections import deque

def is_valid_move(ny,nx,n,m,maps):
    return 0<=ny<n and 0<=nx<m and maps[ny][nx] != "X"

def append_to_queue(ny, nx, k, time, visited, q):
    if not visited[ny][nx][k]:
        visited[ny][nx][k] = True
        q.append((ny, nx, k, time+1))

def solution(maps):
    n, m = len(maps), len(maps[0])
    visited = [[[False for _ in range(2)] for _ in range(m)] for _ in range(n)]
    
    dy = [-1, 1, 0, 0]
    dx = [0, 0, -1, 1]
    q = deque()
    end_y, end_x = -1, -1
    
    for i in range(n):
        for j in range(m):
            if maps[i][j] == "S":
                q.append((i, j, 0, 0))
                visited[i][j][0] = True
            if maps[i][j] == "E":
                end_y, end_x = i, j
    
    while q:
        y,x,k,time = q.popleft()
        
        if y == end_y and x == end_x and k == 1:
            return time
        
        for i in range(4):
            ny, nx = y + dy[i], x + dx[i]
            
            if not is_valid_move(ny, nx, n, m, maps):
                continue
            
            if maps[ny][nx] == "L":
                append_to_queue(ny, nx, 1, time, visited, q)
            else:
                append_to_queue(ny, nx, k, time, visited, q)
    return -1
            