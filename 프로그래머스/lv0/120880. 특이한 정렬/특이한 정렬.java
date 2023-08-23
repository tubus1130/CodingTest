import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        
        Arrays.sort(numlist);
        int min = Integer.MAX_VALUE;
        int idx = -1;
        for(int i=0; i<numlist.length; i++){
            numlist[i] -= n;
            if(Math.abs(numlist[i]) < Math.abs(min)){
                min = numlist[i];
                idx = i;
            }
        }
        
        List<Integer> list = new ArrayList<>();
        list.add(min);
        
        int left = idx-1;
        int right = idx+1;
        while(left>=0 && right<numlist.length){
            if(Math.abs(numlist[right]) > Math.abs(numlist[left])){
                list.add(numlist[left--]);
            }else{
                list.add(numlist[right++]);
            }
        }
        
        if(left >= 0){
            for(int i=left; i>=0; i--){
                list.add(numlist[left--]);
            }
        }
        if(right <= numlist.length-1){
            for(int i=right; i<numlist.length; i++){
                list.add(numlist[right++]);
            }
        }
        int[] answer = new int[list.size()];
        
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i) + n;
        }
        
        
        return answer;
    }
}