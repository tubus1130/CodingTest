import java.util.TreeSet;

class Solution {
    public int[] solution(int[] numbers) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                set.add(numbers[i]+numbers[j]);
            }
        }
        int[] answer = new int[set.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = set.pollFirst();
        }
        return answer;
    }
}
/*
- 중복값이 없어야됨 set
- O(N2)을 써도 시간충족됨, 개수적어서
*/