class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i=1; i<food.length; i++){
            for(int j=0; j<food[i]/2; j++){
                answer += i + "";
            }
        }
        String temp = "";
        for(int i=answer.length()-1; i>=0; i--){
            temp += answer.charAt(i);
        }
        answer += "0";
        answer += temp;
        return answer;
    }
}