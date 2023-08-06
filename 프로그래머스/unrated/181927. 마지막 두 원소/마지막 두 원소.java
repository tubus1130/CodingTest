class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        for(int i=0; i<num_list.length; i++){
            answer[i] = num_list[i];
        }
        int last1 = num_list[num_list.length-1];
        int last2 = num_list[num_list.length-2];
        
        if(last1 > last2){
            answer[answer.length-1] = last1 - last2;
        }else{
            answer[answer.length-1] = 2 * last1;
        }
        
        return answer;
    }
}