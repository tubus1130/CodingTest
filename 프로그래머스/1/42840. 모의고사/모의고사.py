'''
반복
1번 : 1,2,3,4,5
2번 : 2,1,2,3,2,4,2,5
3번 : 3,3,1,1,2,2,4,4,5,5

'''
def solution(answers):
    answer = []
    p1 = [1,2,3,4,5] * 2000
    p2 = [2,1,2,3,2,4,2,5] * 2000
    p3 = [3,3,1,1,2,2,4,4,5,5] * 2000
    count1 = 0
    count2 = 0
    count3 = 0
    for i in range(len(answers)):
        if answers[i] == p1[i]:
            count1 += 1
        if answers[i] == p2[i]:
            count2 += 1
        if answers[i] == p3[i]:
            count3 += 1
            
    maxcnt = max(count1, count2, count3)
    if maxcnt == count1:
        answer.append(1)
    if maxcnt == count2:
        answer.append(2)
    if maxcnt == count3:
        answer.append(3)
    return answer