import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        int i = 1;
        while(i <= n){
            if(n % i == 0){
                list.add(i);
            }
            i++;
        }
        int[] result = new int[list.size()];
        for(int j=0; j<result.length; j++){
            result[j] = list.get(j);
        }
        return result;
    }
}