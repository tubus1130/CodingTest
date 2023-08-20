import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        for(int i=0; i<delete_list.length; i++){
            temp.add(delete_list[i]);
        }
        for(int num : arr){
            if(!temp.contains(num)){
                list.add(num);
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}