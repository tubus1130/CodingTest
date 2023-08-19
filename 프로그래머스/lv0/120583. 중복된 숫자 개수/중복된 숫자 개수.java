import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        Arrays.sort(array);
        for(int i=0; i<array.length; i++){
            if(array[i] == n){
                answer++;
            }
            if(array[i] > n){
                break;
            }
        }
        return answer;
    }
}