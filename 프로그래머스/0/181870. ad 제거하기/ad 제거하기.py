def solution(strArr):
    answer = []
    for st in strArr:
        if "ad" not in st:
            answer.append(st)
    return answer