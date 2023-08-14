class Solution {
    public String[] solution(String[] names) {
        String[] answer = new String[(names.length-1) / 5 + 1];
        for(int i=0; i<answer.length; i++){
            answer[i] = names[5 * i];
        }
        return answer;
    }
}