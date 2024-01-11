'''
주문할 때 가장 많이 함께 주문한 단품메뉴들을 코스요리 메뉴로 구성
단, 코스요리 메뉴는 최소 2가지 이상의 단품메뉴로 구성하려고 합니다. 또한, 최소 2명 이상의 손님으로부터 주문된 단품메뉴 조합에 대해서만 코스요리 메뉴 후보에 포함하기로 했습니다

orders배열에 있는 요소들 오름차순정렬

'''
from itertools import combinations
from collections import Counter

def solution(orders, course):
    answer = []
    
    for c in course:
        menu = []
        for order in orders:
            comb = combinations(sorted(order), c)
            menu += comb
        counter = Counter(menu)
        if (len(counter) != 0 and max(counter.values()) != 1):
            for m, cnt in counter.items():
                if cnt == max(counter.values()):
                    answer.append("".join(m))
    
    return sorted(answer)