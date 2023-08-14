class Solution {
    public int solution(int order) {
        int answer = 0;
        while(order > 0){
            int rest = order % 10;
            if(rest % 3 == 0 && rest != 0){
                answer++;
            }
            order /= 10;
        }
        return answer;
    }
}