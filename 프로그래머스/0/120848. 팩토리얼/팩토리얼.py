'''
2! = 2
3! = 6
4! = 24

7 23
'''
def solution(n):
    answer = 1
    temp = 1
    while n >= temp:
        temp *= answer
        answer += 1
    return answer-2