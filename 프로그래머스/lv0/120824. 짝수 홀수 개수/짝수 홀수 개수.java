class Solution {
    public int[] solution(int[] num_list) {
        int[] result = new int[2];
        for(int num : num_list){
            if(num % 2 == 0){
                result[0]++;
            }else{
                result[1]++;
            }
        }
        
        return result;
    }
}