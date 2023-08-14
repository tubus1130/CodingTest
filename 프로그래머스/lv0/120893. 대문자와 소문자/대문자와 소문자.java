class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        for(int i=0; i<arr.length; i++){
            if(arr[i] < 97){
                arr[i] +=32;
            }else{
                arr[i] -=32;
            }
        }
        for(int i=0; i<arr.length; i++){
            answer += arr[i];
        }
        return answer;
    }
}