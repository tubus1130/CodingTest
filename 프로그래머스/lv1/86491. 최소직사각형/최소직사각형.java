class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max1 = 0;
        int max2 = 0;
        for(int[] size : sizes){
            if(size[0] < size[1]){
                int temp = size[0];
                size[0] = size[1];
                size[1] = temp;
            }
            if(max1 < size[0]){
                max1 = size[0];
            }
            if(max2 < size[1]){
                max2 = size[1];
            }
        }
        
        return max1 * max2;
    }
}