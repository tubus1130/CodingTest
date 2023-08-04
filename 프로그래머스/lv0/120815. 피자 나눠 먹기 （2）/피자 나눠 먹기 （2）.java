class Solution {
    public int solution(int n) {
        int pieces = 6;
        int cnt = 1;
        while(true){
            if((pieces*cnt) % n == 0){
               break; 
            }
            cnt++;
        }
        
        return cnt;
    }
}