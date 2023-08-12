class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        if(n == 1){
            int[] answer = new int[b+1];
            for(int i=0; i<answer.length; i++){
                answer[i] = num_list[i];
            }
            return answer;
        }else if(n == 2){
            int[] answer = new int[num_list.length - a];
            for(int i=0; i<answer.length; i++){
                answer[i] = num_list[a++];
            }
            return answer;
        }else if(n == 3){
            int[] answer = new int[b-a+1];
            for(int i=0; i<answer.length; i++){
                answer[i] = num_list[a++];
            }
            return answer;
        }else{
            int[] answer = new int[(b-a)/2 + 1];
            for(int i=0; i<answer.length; i++){
                answer[i] = num_list[a + c*i];
            }
            return answer;
        }
    }
}