class Solution {
    public int solution(String[] strArr) {
        int[] arr = new int[31];
        for(String str : strArr){
            arr[str.length()]++;
        }
        int max = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i] >= max){
                max = arr[i];
            }
        }
        return max;
    }
}