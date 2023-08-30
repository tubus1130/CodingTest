import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<numbers.length-1; i++){
            int left = i;
            int right = i+1;
            while(left < right){
                int num = numbers[left] + numbers[right];
                if(!list.contains(num)){
                    list.add(num);
                }
                if(right != numbers.length-1){
                    right++;
                }else{
                    left++;
                    right = left+1;
                    if(right == numbers.length){
                        break;
                    }
                }
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        
        return answer;
    }
}