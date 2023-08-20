class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        
        int x = 0;
        int y = 0;
        int xB = board[0] / 2;
        int yB = board[1] / 2;
        for(String str : keyinput){
            if(str.equals("up") && y<yB){
                y++;
            }else if(str.equals("down") && (y>-yB)){
                y--;
            }else if(str.equals("left") && (x>-xB)){
                x--;
            }else if(str.equals("right") && (x<xB)){
                x++;
            }
        }
        int[] answer = {x, y};
        return answer;
    }
}