import java.util.*;

class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        int i = 0;
        while(i < numbers.length()){
            if(list.contains(numbers.substring(i, i+3))){
                answer += list.indexOf(numbers.substring(i, i+3));
                i+=3;
            }else if(list.contains(numbers.substring(i, i+4))){
                answer += list.indexOf(numbers.substring(i, i+4));
                i+=4;
            }else if(list.contains(numbers.substring(i, i+5))){
                answer += list.indexOf(numbers.substring(i, i+5));
                i+=5;
            }
            if(i < numbers.length()){
                answer *= 10;   
            }
        }
        return answer;
    }
}