class Solution {
    boolean solution(String s) {
        int cnt = 0;
        for(char c : s.toCharArray()){
            if(c == 'p' || c == 'P'){
                cnt++;
            }else if(c == 'y' || c == 'Y'){
                cnt--;
            }
        }

        return cnt == 0 ? true : false;
    }
}