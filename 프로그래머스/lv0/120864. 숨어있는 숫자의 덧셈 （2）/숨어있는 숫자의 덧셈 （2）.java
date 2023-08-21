class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char[] arr = my_string.toCharArray();
        int temp = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] - '0' >= 0 && arr[i] - '0' <= 9){
                if(temp != 0){
                    temp *= 10;
                }
                temp += arr[i] - '0';
            }else{
                answer += temp;
                temp = 0;
            }
        }
        if(temp != 0){
            answer += temp;
        }
        return answer;
    }
}