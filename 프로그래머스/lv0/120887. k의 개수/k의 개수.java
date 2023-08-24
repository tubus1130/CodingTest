class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int idx = i; idx<=j; idx++){
            String str = String.valueOf(idx);
            for(char c : str.toCharArray()){
                if(c == String.valueOf(k).charAt(0)){
                    answer++;
                }
            }
        }
        return answer;
    }
}