def solution(s1, s2):
    answer = 0
    for char1 in s1:
        if char1 in s2:
            answer += 1
    return answer