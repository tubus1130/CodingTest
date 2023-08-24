class Solution {
    public int solution(int chicken) {
        int answer = -1;
        // 1999 22
        int total = 0; // 199 + 19 + 1 + 2
        int rest = 0;  // 28
        while(chicken > 0){
            total += chicken/10;
            rest += chicken%10;
            chicken /= 10;
        }
        while(rest>=10){
            total += rest/10;
            rest = rest/10 + rest%10;
        }
        return total;
    }
}