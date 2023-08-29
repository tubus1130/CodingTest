import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        Arrays.sort(d);
        for(int i=0; i<d.length; i++){
            sum += d[i];
            if(sum > budget){
                answer = i;
                break;
            }
            if(i==d.length-1){
                answer = i+1;
            }
        }
        return answer;
    }
}