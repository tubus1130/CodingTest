'''
딕셔너리 만들기 number배열의 합만큼 discount에서 잘라서 넣기
비교하고 일치하면 result+=1
일치하지않으면 패스
그다음 앞에꺼 지우고, 뒤에꺼 추가해서 반복
'''
def solution(want, number, discount):
    buy = {}
    for i in range(len(want)):
        buy[want[i]] = number[i]
    mart = {}    
    for i in range(10):
        if discount[i] in mart:
            mart[discount[i]] += 1
        else:
            mart[discount[i]] = 1
    result = 0
    for i in range(9, len(discount)):
        if buy == mart:
            result += 1
        if i == len(discount) -1:
            break
        else:
            mart[discount[i-9]] -= 1
            if mart[discount[i-9]] == 0:
                del mart[discount[i-9]]
            if discount[i+1] in mart:
                mart[discount[i+1]] += 1
            else:
                mart[discount[i+1]] = 1
    
    return result