import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<rank.length; i++){
            list.add(rank[i]);
        }
        List<Integer> temp = new ArrayList<>();
        for(int i=1; i<rank.length+1; i++){
            if(attendance[list.indexOf(i)]){
                temp.add(list.indexOf(i));
            }
            if(temp.size() == 3){
                break;
            }
        }
        answer = 10000 * temp.get(0) + 100 * temp.get(1) + temp.get(2);
        
        return answer;
    }
}