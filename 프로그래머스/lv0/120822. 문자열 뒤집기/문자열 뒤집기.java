class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] charArr = my_string.toCharArray();
        for(int i=charArr.length-1; i>=0; i--){
            answer+= charArr[i];
        }
        return answer;
    }
}