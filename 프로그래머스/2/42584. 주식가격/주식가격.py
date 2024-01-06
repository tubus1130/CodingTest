'''
슈도코드
시간++
새로운값이 top보다 크면 push 
새로운값이 top보다 작으면 스택에서 pop하고 시간기록 지금들어온시간 - 스택길이

[2,3,4,1,3] [3,2,1,1,0]
시간 4
타깃 -1
스택 2 3 
타깃이가리키는값 = 시간 - 스택현재길이
    타깃--
[3,2,1,0,0]
스택이비어있으면
    타깃++
    스택 push
'''

def solution(prices):
    n = len(prices)
    answer = [0] * n
    
    stack = [0]
    for i in range (1, n):
        while stack and prices[i] < prices[stack[-1]]:
            j =  stack.pop()
            answer[j] = i - j
        stack.append(i)
    while stack:
        j = stack.pop()
        answer[j] = n - 1 - j
    return answer