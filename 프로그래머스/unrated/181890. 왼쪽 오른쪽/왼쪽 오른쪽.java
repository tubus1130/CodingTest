import java.util.*;
class Solution {
    public String[] solution(String[] str_list) {
        
        List<String> list = new ArrayList<>();
        
        int idx = 0;
        String temp = "";
        for(String str : str_list){
            if(str.equals("l")){
                temp = "l";
                break;
            }else if(str.equals("r")){
                temp = "r";
                break;
            }
            idx++;
        }
        
        if(temp == "l"){
            for(int i=0; i<idx; i++){
                list.add(str_list[i]);
            }
        }else if(temp == "r"){
            for(int i=idx+1; i<str_list.length; i++){
                list.add(str_list[i]);
            }
        }
        String[] answer = new String[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}