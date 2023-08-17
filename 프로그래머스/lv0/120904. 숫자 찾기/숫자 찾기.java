class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        int cnt = 1;
        while(num > 0){
            if(num % 10 == k){
                answer = cnt;
            }
            num /= 10;
            cnt++;
        }
        return answer==-1?-1:cnt-answer;
    }
}