class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        for(int i=0; i< cipher.length() / code; i++){
            answer += cipher.charAt(code*i+code-1);
        }
        /*
        3 4a+3
        7
        11
        
        1
        3
        5
        */
        return answer;
    }
}