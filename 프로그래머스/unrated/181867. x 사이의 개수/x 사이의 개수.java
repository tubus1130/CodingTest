import java.util.*;
class Solution {
    public int[] solution(String myString) {
        List<Integer> list = new ArrayList<>();
        int cnt = 0;
        for(char c : myString.toCharArray()){
            if(c != 'x'){
                cnt++;
            }else{
                list.add(cnt);
                cnt = 0;
            }
        }
        list.add(cnt);
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}