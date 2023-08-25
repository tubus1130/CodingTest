import java.util.*;
class Solution {
    public long solution(long n) {
        List<Integer> list = new ArrayList<>();
        while(n > 0){
            list.add((int)(n%10));
            n/=10;
        }
        long answer = 0;
        Collections.sort(list, Collections.reverseOrder());
        for(int i=0; i<list.size(); i++){
            answer *= 10;
            answer += list.get(i);
        }
        
        return answer;
    }
}