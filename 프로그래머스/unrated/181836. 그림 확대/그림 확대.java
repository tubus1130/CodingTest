class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        for(int i=0; i<picture.length; i++){
            String temp = "";
            for(char c : picture[i].toCharArray()){
                String str = String.valueOf(c);
                temp += str.repeat(k);
            }
            for(int idx = k*i; idx<k*i+k; idx++){
                answer[idx] = temp;
            }
        }
        return answer;
    }
}