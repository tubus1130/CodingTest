class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = "";
        while(n>0){
            str += String.valueOf(n%3);
            n/=3;
        }
        String[] arr = str.split("");
        int radix = 1;
        for(int i=arr.length-1; i>=0; i--){
            answer += Integer.parseInt(arr[i]) * radix;
            radix *= 3;
        }
        return answer;
    }
}