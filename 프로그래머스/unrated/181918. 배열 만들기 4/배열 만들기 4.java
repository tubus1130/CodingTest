import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(list.size() == 0){
                list.add(arr[i]);
            }else{
                if(list.get(list.size()-1) < arr[i]){
                    list.add(arr[i]);
                }else{
                    list.remove(list.size()-1);
                    i--;
                }
            }
        }
        int[] stk = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            stk[i] = list.get(i);
        }
        return stk;
    }
}