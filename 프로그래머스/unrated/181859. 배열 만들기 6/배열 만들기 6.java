import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        while(i < arr.length){
            if(stack.isEmpty()){
                stack.push(arr[i++]);
            }else{
                if(stack.peek() == arr[i]){
                    stack.pop();
                    i++;
                }else{
                    stack.push(arr[i++]);
                }
            }
        }
        if(stack.size() == 0){
            stack.push(-1);
        }
        int[] answer = new int[stack.size()];
        for(int idx=answer.length-1; idx>=0; idx--){
            answer[idx] = stack.pop();
        }
        return answer;
    }
}