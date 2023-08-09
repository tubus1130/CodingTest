class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        int idx = 0;
        for(int[] part : parts){
            answer += my_strings[idx++].substring(part[0], part[1] + 1);
        }
        return answer;
    }
}