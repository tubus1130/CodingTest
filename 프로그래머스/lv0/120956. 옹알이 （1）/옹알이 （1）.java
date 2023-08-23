class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] arr = {"aya", "ye", "woo", "ma"};
        for(String str : babbling){
            for(String s : arr){
                if(str.contains(s)){
                    str = str.replace(s, " ");
                }
            }
            str = str.replace(" ", "");
            if(str.equals("")){
                answer++;
            }
        }
        return answer;
    }
}