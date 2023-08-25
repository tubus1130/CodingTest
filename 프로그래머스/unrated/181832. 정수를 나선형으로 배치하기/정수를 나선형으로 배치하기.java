class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int value = 1; // 채워야 할 정수 값
        int row = 0; // 현재 행 위치
        int col = 0; // 현재 열 위치
        int direction = 0; // 이동 방향 (0: 오른쪽, 1: 아래, 2: 왼쪽, 3: 위)

        while (value <= n * n) { // 모든 정수 값을 배열에 채우면 종료
            answer[row][col] = value++; // 현재 위치에 값을 채우고 다음 값으로 이동

            // 다음 이동할 위치 계산
            if (direction == 0) { // 오른쪽 방향으로 이동
                if (col == n - 1 || answer[row][col + 1] != 0) {
                    direction = 1;
                    row++;
                } else {
                    col++;
                }
            } else if (direction == 1) { // 아래쪽 방향으로 이동
                if (row == n - 1 || answer[row + 1][col] != 0) {
                    direction = 2;
                    col--;
                } else {
                    row++;
                }
            } else if (direction == 2) { // 왼쪽 방향으로 이동
                if (col == 0 || answer[row][col - 1] != 0) {
                    direction = 3;
                    row--;
                } else {
                    col--;
                }
            } else if (direction == 3) { // 위쪽 방향으로 이동
                if (row == 0 || answer[row - 1][col] != 0) {
                    direction = 0;
                    col++;
                } else {
                    row--;
                }
            }
        }

        return answer;
    }
}