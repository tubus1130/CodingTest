class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        /*
        12 6 3 1 -> 3
        4 2 1 -> 2
        15 7 3 1 -> 3
        1 -> 0
        14 7 3 1 -> 3
        */
        for(int i=0; i<num_list.length; i++){
            while(num_list[i] != 1){
                if(num_list[i] % 2 == 0){
                    num_list[i] /= 2;
                }else{
                    num_list[i] = (num_list[i] - 1) / 2;
                }
                answer++;
            }
        }
        return answer;
    }
}