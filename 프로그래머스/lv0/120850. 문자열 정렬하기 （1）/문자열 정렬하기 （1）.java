import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<my_string.length(); i++){
            int temp = my_string.charAt(i) - '0';
            if(temp >= 0 && temp <= 9){
                list.add(temp);
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i).intValue();
        }
        Arrays.sort(answer);
        return answer;
    }
}