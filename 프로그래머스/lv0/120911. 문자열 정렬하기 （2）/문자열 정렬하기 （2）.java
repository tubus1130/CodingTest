import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = my_string.toLowerCase();
        char[] arr = answer.toCharArray();
        Arrays.sort(arr);
        answer = "";
        for(int i=0; i<arr.length; i++){
            answer += arr[i];
        }
        return answer;
    }
}