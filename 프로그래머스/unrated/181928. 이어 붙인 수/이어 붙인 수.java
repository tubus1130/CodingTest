class Solution {
    public int solution(int[] num_list) {
        int temp1 = 0;
        int temp2 = 0;
        for(int i=0; i<num_list.length; i++){
            if(num_list[i] % 2 != 0){
                temp1 *= 10;
                temp1 += num_list[i];
            }else{
                temp2 *= 10;
                temp2 += num_list[i];
            }
        }
        
        return temp1 + temp2;
    }
}