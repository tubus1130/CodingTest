class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        while(s < e){
            char temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        
        for(int i=0; i<arr.length; i++){
            answer += arr[i];
        }
        return answer;
    }
}