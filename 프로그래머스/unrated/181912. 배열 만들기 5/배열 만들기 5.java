import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new LinkedList<>();
        for(String str : intStrs){
            int answer = Integer.parseInt(str.substring(s, s+l));
            if(answer > k){
                list.add(answer);
            }
        }
        int[] result = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
    }
}