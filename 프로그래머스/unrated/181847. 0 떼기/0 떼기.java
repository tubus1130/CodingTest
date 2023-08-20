class Solution {
    public String solution(String n_str) {
        String answer = "";
        boolean flag = true;
        for(char c : n_str.toCharArray()){
            if(flag && c=='0'){
                continue;
            }
            flag=false;
            answer += c;
        }
        return answer;
    }
}