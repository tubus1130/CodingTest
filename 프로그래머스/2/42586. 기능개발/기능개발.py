'''
큐
남은일수 미리계산해두고
7 3 9
완성되면 pop하는데 지금꺼보다 더 작은값들까지 계속 pop하면 cnt++

큐가 없을때까지 반복
'''
from collections import deque
def solution(progresses, speeds):
    answer = []
    dday = deque()
    for i in range(len(progresses)):
        dday.append((100-progresses[i]) // speeds[i])
        if (100-progresses[i]) % speeds[i] != 0:
            dday[i] += 1
    while len(dday) != 0:
        cnt = 1
        base = dday.popleft()
        while(dday and dday[0] <= base):
            dday.popleft()
            cnt+=1
        answer.append(cnt)
    return answer