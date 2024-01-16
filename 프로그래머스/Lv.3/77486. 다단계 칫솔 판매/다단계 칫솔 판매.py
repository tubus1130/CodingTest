'''
트리를 만들고
이익분배

딕셔너리형

판사람꺼 90% 더하고
상사 검색해서 그사람 전체의 10% * 0.9만큼 더함
또 상사검색하는데, 조건이 1원이상
'''
def solution(enroll, referral, seller, amount):
    parent = dict(zip(enroll, referral))
    
    total = {name : 0 for name in enroll}
    
    for i in range(len(seller)):
        money = amount[i] * 100
        cur_name = seller[i]
        while money > 0 and cur_name != "-":
            total[cur_name] += money - money // 10
            cur_name = parent[cur_name]
            money //= 10
    return [total[name] for name in enroll]