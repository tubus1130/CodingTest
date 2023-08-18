class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String str = "";
        for(char c : myString.toCharArray()){
            if(c == 'A'){
                str += "B";
            }else{
                str += "A";
            }
        }
        if(str.contains(pat)){
            return 1;
        }else{
            return 0;
        }
    }
}