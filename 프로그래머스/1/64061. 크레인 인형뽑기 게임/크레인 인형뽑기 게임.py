'''
게임 화면의 격자의 상태가 담긴 2차원 배열 board
크레인을 작동시킨 위치가 담긴 배열 moves
터트려져 사라진 인형의 개수를 return 

moves 값에따라
1이면 0열, 2면 1열, 
[1,0]
[2,0]
while문 써서 일단 찾고 그값을 0으로바꾸면서 moves에담음
moves의 top과비교해서 같으면 pop 다르면 push
pop할때마다 answer++

stack 만들기
움직이는 개수마다 반복:
    0이아닌 값 찾기
'''

def solution(board, moves):
    answer = 0
    stack = []
    for move in moves: #[1,5,3,5,1,2,1,4] 1파랑 2노랑 3초록 4어피치 5강아지
        i = -1
        for row in range(0, len(board)):
            if board[row][move-1] != 0:
                i = row
                break
        
        if i == -1:
            continue
        pick = board[i][move-1]
        board[i][move-1] = 0
        if stack and stack[-1] == pick:
            stack.pop()
            answer+=2
        else:
            stack.append(pick)
    return answer