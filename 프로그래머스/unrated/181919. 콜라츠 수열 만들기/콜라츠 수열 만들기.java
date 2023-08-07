import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();

        list.add(n);
        while(n != 1){
            if(n % 2 == 0){
                n /= 2;
            }else{
                n = 3 * n + 1;
            }
            list.add(n);
        }
        
        int[] arr = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}