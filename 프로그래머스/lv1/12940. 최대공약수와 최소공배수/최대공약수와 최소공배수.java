class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        if(n > m){
            int temp = n;
            n = m;
            m = temp;
        }
        for(int i=n; i>0; i--){
            if(m % i == 0 && n % i == 0){
                answer[0] = i;
                break;
            }
        }
        
        int idx = m;
        while(idx < 1_000_000){
            if(idx % n == 0 && idx % m == 0){
                answer[1] = idx;
                break;
            }else{
                idx++;
            }
        }
        return answer;
    }
}