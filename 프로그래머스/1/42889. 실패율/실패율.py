'''
실패율 : 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
스테이지 개수 : N
멈춰있는 스테이지번호 : stages
실패율이 높은 스테이지부터 내림차순 반환

단, N + 1 은 마지막 스테이지(N 번째 스테이지) 까지 클리어 한 사용자를 나타낸다.
만약 실패율이 같은 스테이지가 있다면 작은 번호의 스테이지가 먼저 오도록 하면 된다.
스테이지에 도달한 유저가 없는 경우 해당 스테이지의 실패율은 0 으로 정의한다.
'''

'''
테스트케이스
도달했던 스테이지
1 : 8    1  = 0.125
2 : 7    3  = 0.4xx
3 : 4    2  = 0.5
4 : 2    1  = 0.5
5 : 1    0  = 0
34215

1 : 5    0 = 0
2 : 5    0 = 0
3 : 5    0 = 0
4 : 5    5 = 1
4123
'''

'''
슈도코드
진행중 or 지나온 스테이지 리스트
현재 위치한 스테이지 리스트
두개 리스트로 실패율 구함
실패율을 내림차순 정렬, 같으면 오름차순 -> max구해서 remove쓰면 될듯 while동안

딕셔너리로 해서 인덱스, 값 계속같이 가야될듯?

아니면 리스트안에 리스트?

fail은 딕셔너리 나머지는 리스트 - 런타임오류, 시간초과
'''
def solution(N, stages):
    challenger = [0] * (N+2)
    for stage in stages:
        challenger[stage] += 1
        
    fails = {}
    total = len(stages)
    
    for i in range(1, N+1):
        if challenger[i] == 0:
            fails[i] = 0
        else:
            fails[i] = challenger[i] / total
            total -= challenger[i]
            
    result = sorted(fails, key=lambda x:fails[x], reverse=True)
    
    return result