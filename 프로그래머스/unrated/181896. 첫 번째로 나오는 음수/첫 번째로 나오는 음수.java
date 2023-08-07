class Solution {
    public int solution(int[] num_list) {
        int idx = -1;
        for(int i=0; i<num_list.length; i++){
            if(num_list[i] < 0){
                idx = i;
                break;
            }
        }
        return idx;
    }
}