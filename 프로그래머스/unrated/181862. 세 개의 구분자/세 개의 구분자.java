import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        String[] answer = myStr.split("");
        List<String> list = new ArrayList<>();
        String temp = "";
        for(int i=0; i<answer.length; i++){
            if(answer[i].equals("a") || answer[i].equals("b") || answer[i].equals("c")){
                if(temp != ""){
                    list.add(temp);
                }
                temp = "";
            }else{
                temp += answer[i];
            }
        }
        if(temp != ""){
            list.add(temp);
        }
        String[] arr;
        if(!list.isEmpty()){
            arr = new String[list.size()];
            for(int i=0; i<arr.length; i++){
                arr[i] = list.get(i);
            }
        }else{
            arr = new String[1];
            arr[0] = "EMPTY";
        }
        
        
        return arr;
    }
}