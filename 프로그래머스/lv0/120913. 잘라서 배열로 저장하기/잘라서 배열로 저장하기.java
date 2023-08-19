class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[(my_str.length() - 1) / n + 1];
        int last = 0;
        for(int i=0; i<answer.length-1; i++){
            answer[i] = my_str.substring(n*i, n*(i+1));
            last = n*(i+1);
        }
        answer[answer.length-1] = my_str.substring(last);
        return answer;
    }
}