'''
uid를 키로 닉네임을 밸류로
딕셔너리형태로 저장
첫 반복에서
최종닉네임확정

두반복에서
result에값 추가
'''
def solution(record):
    answer = []
    info = {}
    for rec in record:
        lst = rec.split(" ")
        if rec.startswith("E"):
            info[lst[1]] = lst[2]
        elif rec.startswith("L"):
            pass
        else:
            info[lst[1]] = lst[2]
    for rec in record:
        lst = rec.split(" ")
        if rec.startswith("E"):
            answer.append(info[lst[1]] + "님이 들어왔습니다.")
        elif rec.startswith("L"):
            answer.append(info[lst[1]] + "님이 나갔습니다.")
        else:
            pass
            
    return answer