class Solution {
    public int solution(int[] numbers, int n) {
        int result = 0;
        int i=0;
        while(true){
            result += numbers[i++];
            if(result > n) break;
        }
        return result;
    }
}