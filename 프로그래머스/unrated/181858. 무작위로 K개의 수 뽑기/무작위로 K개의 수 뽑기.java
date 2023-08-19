import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(list.size() == k){
                break;
            }
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }
        
        while(list.size() < k){
            list.add(-1);
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}