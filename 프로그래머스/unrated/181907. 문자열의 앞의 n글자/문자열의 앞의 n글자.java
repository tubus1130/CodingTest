import java.util.*;
class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int idx = 0;
        for(char c : my_string.toCharArray()){
            answer += c;
            if(idx++ == n-1){
                break;
            }
        }
        return answer;
    }
}