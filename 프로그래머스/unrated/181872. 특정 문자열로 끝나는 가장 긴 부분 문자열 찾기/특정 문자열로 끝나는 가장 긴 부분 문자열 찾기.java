class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        for(int i=0; i<=myString.length()-pat.length(); i++){
            if(myString.substring(i, i+pat.length()).equals(pat)){
                answer = myString.substring(0, i+pat.length());
            }
        }
        return answer;
    }
}