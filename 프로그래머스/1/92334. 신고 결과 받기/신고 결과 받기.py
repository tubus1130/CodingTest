'''
리포트를 set으로 바꿔서 중복제거

신고당한 사람[1]을 키로 신고한사람[0] 밸류로(이중 리스트)

신고당한 사람의 밸류의길이가 2이상인애들의 밸류값 += 1
'''
def solution(id_list, report, k):
    reported_user = {} # 신고당한 유저
    count = {} # 신고한 유저, 메일받아야할 유저
    
    for r in report:
        user_id, reported_id = r.split()
        if reported_id not in reported_user:
            reported_user[reported_id] = set()
        reported_user[reported_id].add(user_id)
        
    for reported_id, user_id_lst in reported_user.items():
        if len(user_id_lst) >= k:
            for uid in user_id_lst:
                if uid not in count:
                    count[uid] = 1
                else:
                    count[uid] += 1
    answer = []
    for i in range(len(id_list)):
        if id_list[i] not in count:
            answer.append(0)
        else:
            answer.append(count[id_list[i]])
        
    return answer