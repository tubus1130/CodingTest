import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        /*
        0 1 2 3 4
        1 2 3 4
        1 2 3
        */
        for(int i=0; i<query.length; i++){
            if (i%2==0){
                arr = Arrays.copyOfRange(arr, 0, query[i]+1);
            }else{
                arr = Arrays.copyOfRange(arr, query[i], arr.length);
            }
        }
        return arr;
    }
}