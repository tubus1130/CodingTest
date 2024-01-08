'''
card 1,2를 둘다 큐로만들어서
꺼낸값이랑 goal이랑 비교한후 같으면 다음꺼 pop해서 준비
goal끝까지 다 ok면 yes 도중에안되면 no출력후 break
'''
from collections import deque
def solution(cards1, cards2, goal):
    answer = ''
    cards1 = deque(cards1)
    cards2 = deque(cards2)
    goal = deque(goal)
    total = len(goal)
    cnt = 0
    
    while goal:
        if cards1 and cards1[0] == goal[0]:
            cards1.popleft()
            goal.popleft()
            cnt += 1
        elif cards2 and cards2[0] == goal[0]:
            cards2.popleft()
            goal.popleft()
            cnt += 1
        else:
            break
    if cnt == total:
        answer += "Yes"
    else:
        answer += "No"
    
    return answer