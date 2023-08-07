class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] query : queries){
            int s = query[0]; //0
            int e = query[1]; //4
            int k = query[2]; //1
            
            while(s <= e){
                if(s % k == 0){
                    arr[s]++;
                }
                s++;
            }
        }
        
        return arr;
    }
}