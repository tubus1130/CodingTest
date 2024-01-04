'''
-5 ~ 5
이동하고 범위제한확인
안에있다면 그대로 => 처음가본길여부함수
넘어가면 다시 롤백

처음가본길여부
[0, 0] [0, 1]
[0, 1] [0, 0]
리스트 안에 리스트로 넣고
근데 한번간거를 반대쪽것도 같이 넣어둠
set으로 변경해서 중복값 제거
길이/2하면될듯?
'''

def solution(dirs):
    now = [0,0]
    visit = []
    answer = 0
    for dir in dirs:
        now = move(dir, now, visit)
    answer = len(visit) / 2
    return answer

def move(dir, now, visit):
    temp = [0,0]
    temp[0], temp[1] = now[0], now[1]
    if dir == 'U':
        temp[1] += 1
    elif dir == 'D':
        temp[1] -= 1
    elif dir == 'L':
        temp[0] -= 1
    else:
        temp[0] += 1
    if temp[0] >= -5 and temp[0] <= 5 and temp[1] >= -5 and temp[1] <= 5:
        t1 = temp + now
        t2 = now + temp
        if t1 not in visit and t2 not in visit:
            visit.append(t1)
            visit.append(t2)
        return temp
    else:
        return now
    