class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] queryArr : queries){
            int i = queryArr[0];
            int j = queryArr[1];
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
        return arr;
    }
}