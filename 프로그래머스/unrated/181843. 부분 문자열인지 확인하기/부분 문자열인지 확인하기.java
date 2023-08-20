class Solution {
    public int solution(String my_string, String target) {
        int answer = 0;
        int idx = 0;
        while(idx+target.length() <= my_string.length()){
            if(my_string.substring(idx, idx+target.length()).equals(target)){
                return 1;
            }
            idx++;
        }
        return 0;
    }
}