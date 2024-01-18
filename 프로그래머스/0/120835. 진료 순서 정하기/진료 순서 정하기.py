'''
배열돌면서 딕셔너리 생성
내림차순정렬
딕셔너리의 키값에 밸류(순서 할당)

emer배열돌면서 value값 result에 append
'''
def solution(emergency):
    answer = []
    dic = dict()
    sort_emergency = sorted(emergency, reverse=True)
    i = 1
    for value in sort_emergency:
        dic[value] = i
        i+=1
    for value in emergency:
        answer.append(dic[value])
    
    return answer