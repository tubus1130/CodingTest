def solution(money):
    answer = []
    cnt = 0
    while money >= 5500:
        money -= 5500
        cnt += 1
    answer.append(cnt)
    answer.append(money)
    return answer