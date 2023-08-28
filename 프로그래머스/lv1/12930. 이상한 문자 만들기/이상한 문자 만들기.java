class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        int idx = 0;
        for(String str : arr){
            if(!str.equals(" ")){
                if(idx % 2 == 0){
                    answer += str.toUpperCase();
                }else{
                    answer += str.toLowerCase();
                }
                idx++;
            }else{
                answer += " ";
                idx = 0;
            }
        }
        return answer;
    }
}