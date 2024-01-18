'''
part를 딕셔너리로 만들고, 동명이인은 +=1
comp 반복돌면서 값 -=1 value가 0이되면 del

string으로 변환해서 딕셔너리의 키 반환
'''
def solution(participant, completion):
    dic = dict()
    for part in participant:
        if part not in dic:
            dic[part] = 1
        else:
            dic[part] += 1
    for com in completion:
        dic[com] -= 1
    for key in dic.keys():
        if dic[key] > 0:
            return key
    return dic