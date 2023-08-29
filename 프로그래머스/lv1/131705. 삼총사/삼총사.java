class Solution {
    public int solution(int[] number) {
        int answer = 0;
        // -5 -2 0 2 3
        // -5 2 3
        // -2 0 2
        // 
        for(int i=0; i<number.length-2; i++){
            int target = -number[i];
            int left = i+1;
            int right = i+2;
            while(left < right){
                if(number[left] + number[right] == target){
                    answer++;
                }
                if(right != number.length-1){
                    right++;
                }else{
                    left++;
                    if(left != number.length-1){
                        right = left+1;
                    }
                }
            }
        }
        
        return answer;
    }
}