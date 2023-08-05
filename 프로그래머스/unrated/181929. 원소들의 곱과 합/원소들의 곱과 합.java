class Solution {
    public int solution(int[] num_list) {
        int mulTemp = 1;
        int plusTemp = 0;
        for(int i=0; i<num_list.length; i++){
            mulTemp *= num_list[i];
            plusTemp += num_list[i];
        }
        if(mulTemp > plusTemp*plusTemp){
            return 0;
        }else{
            return 1;
        }
    }
}