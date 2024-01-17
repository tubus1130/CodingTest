def solution(array, n):
    answer = 0
    while n in array:
        array.remove(n)
        answer += 1
    return answer