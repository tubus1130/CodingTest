class Solution {
    public int solution(int[] num_list) {
        int odd = num_list[1];
        int even = num_list[0];
        
        for(int i=2; i<num_list.length; i++){
            if(i%2==0){
                even += num_list[i];
            }else{
                odd += num_list[i];
            }
        }
        
        return even > odd ? even : odd;
    }
}