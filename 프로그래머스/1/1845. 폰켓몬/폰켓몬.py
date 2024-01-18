'''
딕셔너리에 nums값 넣기, 키 = 3, value = 개수
nums의 길이의 반을 k로 정하고

딕셔너리의 길이가 k보다 크거나 같으면 k 출력, 아니면, 딕셔너리 길이 출력
'''
def solution(nums):
    answer = 0
    dic = dict()
    for num in nums:
        if num not in dic:
            dic[num] = 1
        else:
            dic[num] += 1
    k = len(nums) // 2
    if len(dic) >= k:
        return k
    else:
        return len(dic)
    
    return len(dic)