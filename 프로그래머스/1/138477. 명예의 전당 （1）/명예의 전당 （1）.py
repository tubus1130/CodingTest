'''
스택을 써서 역순으로 정렬하고
새로들어온값이 마지막값보다 크면 팝 푸쉬, 작으면 패스
result에 마지막값 추가
'''
def solution(k, score):
    answer = []
    stack = []
    for sc in score:
        if len(stack) < k:
            stack.append(sc)
        else:
            if sc > stack[-1]:
                stack.pop()
                stack.append(sc)
            else:
                pass
        stack.sort(reverse=True)
        answer.append(stack[-1])
    return answer