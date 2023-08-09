class Solution {
    public int solution(int hp) {
        int answer = 0;
        int a = 5;
        int b = 3;
        int c = 1;
        
        answer += hp/a;
        hp %= a;
        answer += hp/b;
        hp %= b;
        answer += hp/c;
        
        return answer;
    }
}