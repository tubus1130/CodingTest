class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        if(denom1 % denom2 == 0 || denom2 % denom1 == 0){
            if(denom1 > denom2){
                int digit = denom1/denom2;
                denom2 *= digit;
                numer2 *= digit;
            }else{
                int digit = denom2/denom1;
                denom1 *= digit;
                numer1 *= digit;
            }
        }else{
            int digit1 = denom2;
            int digit2 = denom1;
            denom1 *= digit1;
            numer1 *= digit1;
            denom2 *= digit2;
            numer2 *= digit2;
        }
        answer[0] = numer1+numer2;
        answer[1] = denom1;
        
        for(int i=2; i<=answer[1]; i++){
            if(answer[0] % i == 0 && answer[1] % i == 0){
                answer[0] /= i;
                answer[1] /= i;
                i--;
            }
        }
        
        return answer;
    }
}