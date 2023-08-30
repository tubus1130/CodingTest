class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        for(int i=0; i<answer.length; i++){
            String temp = s.substring(0,i);
            if(!temp.contains(s.substring(i, i+1))){
                answer[i] = -1;
            }else{
                answer[i] = temp.length() - temp.lastIndexOf(s.substring(i, i+1));
            }
        }
        return answer;
    }
}