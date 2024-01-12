'''
s를 한개씩 잘라서
index만큼 +=1
도중에 skip에있는 문자에 포함되면 그냥 패스 아니면 +=1
97~122 범위벗어나면 -26
ord(a) = 97
ord(z) = 122
'''
def solution(s, skip, index):
    answer = ''
    for c in s:
        cnt = 0
        
        while cnt != index:
            c = chr(ord(c) + 1)
            if ord(c) > 122:
                c = chr(ord(c) - 26)
            if c not in skip:
                cnt += 1
        answer += c
    return answer