class Solution {
    public int solution(int n) {
        double answer = Math.sqrt(n);
        if(answer % (int)answer == 0){
            return 1;
        }else{
            return 2;
        }
    }
}