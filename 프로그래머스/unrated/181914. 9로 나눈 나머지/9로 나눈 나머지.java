class Solution {
    public int solution(String number) {
        int answer = 0;
        char[] arr = number.toCharArray();
        for(int i=0; i<arr.length; i++){
            answer += (arr[i]-48);
        }
        return answer % 9;
    }
}