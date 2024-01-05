'''
문자열을 받아서
반복문돌리면서 케이스생성 한 후 스택에 넣다뺌으로써 올바른 문자열인지 확인
( { [

0 1 2 3 4 5
5 0 1 2 3 4
리스트앞에꺼 빼서 뒤로 list[0] remove, append
'''
def solution(s):
    answer = 0
    for _ in range(len(s)-1):
        # 올바른 문자열확인
        stack = []
        cnt = 0
        for val in s:
            if val == '(' or val == '{' or val =='[':
                stack.append(val)
            else:
                if stack:
                    # 값이 있을경우
                    if val == ')' and stack.pop() == '(':
                        pass
                    elif val == '}' and stack.pop() == '{':
                        pass
                    elif val == ']' and stack.pop() == '[':
                        pass
                    else:
                        break
                else:
                    break
            cnt += 1
        if not stack and cnt == len(s):
            answer += 1
        # 왼쪽으로 밀기
        new = ""
        for i in range(1, len(s)):
            new += s[i]
        new += s[0]
        s = new
    return answer