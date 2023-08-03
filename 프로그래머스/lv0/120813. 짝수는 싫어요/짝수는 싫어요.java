class Solution {
    public int[] solution(int n) {
        int digit = 0;
        if(n%2==0){
            digit = n/2;
        }else{
            digit = n/2 + 1;
        }
        int[] answer = new int[digit];
        int i = 0;
        int temp = 1;
        while(temp <= n){
            answer[i++] = temp;
            temp += 2;
        }
        return answer;
    }
}