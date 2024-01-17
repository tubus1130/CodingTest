'''
9부터 내림차순으로 1까지 개수구해서 x,y 중 개수 더 적은거 그만큼 append, 만일 둘중에 하나가 0이면 pass
0일때 겹치는거 1개 이상이면 0 아니면 -1
result가 ""이고 0
'''
def solution(X, Y):
    answer = ''
    temp = 9
    while temp >= 1:
        cntX = X.count(str(temp))
        cntY = Y.count(str(temp))
        answer += str(temp) * min(cntX, cntY)
        temp -= 1
    # temp가 0일때 min이 1이상인데 answer가 비어있으면 0 추가, answer가 있으면 개수만큼 추가
    # min이 0인데 answer가 비어있으면 -1추가, answer가 있으면 패스
    cntX = X.count("0")
    cntY = Y.count("0")
    if min(cntX, cntY) >= 1:
        if answer:
            answer += "0" * min(cntX, cntY)
        else:
            answer += "0"
    else:
        if answer:
            pass
        else:
            answer += "-1"
    return answer