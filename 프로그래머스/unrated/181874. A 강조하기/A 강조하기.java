class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] arr = myString.toCharArray();
        for(char c : arr){
            if(c == 97){
                c -= 32;
            }else if(c < 97 && c > 65){
                c += 32;
            }
            answer += c;
        }
        return answer;
    }
}