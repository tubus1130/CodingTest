class Solution {
    public int solution(int n) {
        int answer = 1;
        int idx = 1;
        while(true){
            answer *= idx;
            if(answer > n){
                idx--;
                break;
            }else{
                idx++;
            }
        }
        return idx;
    }
}