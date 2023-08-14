import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int temp = Integer.MAX_VALUE;
        int answer = 0;
        Arrays.sort(array);
        for(int i=0; i<array.length; i++){
            array[i] -= n;
            if(temp > Math.abs(array[i])){
                temp = Math.abs(array[i]);
                answer = array[i];
            }
        }
        /*
        3 10 30
        -17 -10 10
        
        10 11 12
        -3 -2 -1
        
        1 4 2 1
        3
        */
        return answer + n;
    }
}