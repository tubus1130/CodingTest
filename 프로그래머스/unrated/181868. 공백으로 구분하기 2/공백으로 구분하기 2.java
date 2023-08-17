import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        List<String> list = new ArrayList<>();
        String[] arr = my_string.split(" ");
        for(String str : arr){
            if(!str.equals("")){
                list.add(str);
            }
        }
        String[] answer = new String[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}