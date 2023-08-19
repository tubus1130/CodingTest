import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<flag.length; i++){
            if(flag[i]){
                for(int j=0; j<arr[i]; j++){
                    stack.push(arr[i]);
                    stack.push(arr[i]);
                }
            }else{
                for(int j=0; j<arr[i]; j++){
                    stack.pop();
                }
            }
        }
        int[] answer = new int[stack.size()];
        int i = 0;
        while(!stack.empty()){
            answer[answer.length-1-i++] = stack.pop();
        }
        return answer;
    }
}