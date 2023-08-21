class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[][] cnt = new int[board.length+2][board.length+2];
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                if(board[i][j] == 1){
                    cnt[i][j]--;
                    cnt[i][j+1]--;
                    cnt[i][j+2]--;
                    cnt[i+1][j]--;
                    cnt[i+1][j+1]--;
                    cnt[i+1][j+2]--;
                    cnt[i+2][j]--;
                    cnt[i+2][j+1]--;
                    cnt[i+2][j+2]--;
                }
            }
        }
        for(int i=1; i<cnt.length-1; i++){
            for(int j=1; j<cnt.length-1; j++){
                if(cnt[i][j] == 0){
                    answer++;
                }
            }
        }
        return answer;
    }
}