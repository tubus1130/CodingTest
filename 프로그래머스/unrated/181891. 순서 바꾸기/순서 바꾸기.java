class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        /*
        n부터 num_list끝까지 앞에붙이고
        앞부터 n-1까지 뒤에붙임
        */
        for(int i=0; i<num_list.length - n; i++){
            answer[i] = num_list[n+i];
        }
        for(int i=num_list.length - n; i<num_list.length; i++){
            answer[i] = num_list[i-(num_list.length - n)];
        }
        
        return answer;
    }
}