'''
문자열받아서
스택구조로 하면될듯?
다제거되면 1, 아니면 0
'''

def solution(s):
    stack = []
    for i in s:
        if not stack: # 비어있으면
            stack.append(i)
        else:
            if stack[-1] == i:
                stack.pop()
            else:
                stack.append(i)
    if stack:
        return 0
    else:
        return 1