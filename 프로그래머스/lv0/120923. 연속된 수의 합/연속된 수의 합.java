class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int mid = total / num;
        
        if(num % 2 != 0){
            for(int i=0; i<answer.length; i++){
                answer[i] = mid-num/2+i;
            }
        }else{
            for(int i=0; i<answer.length; i++){
                answer[i] = mid-num/2+1+i;
            }
        }
        return answer;
    }
}