class Solution {
    public String solution(String s) {
        String answer = "";
        int[] cnt = new int[26];
        char[] arr = s.toCharArray();
        for(int i=0; i<arr.length; i++){
            cnt[arr[i] - 'a']++;
        }
        for(int i=0; i<cnt.length; i++){
            if(cnt[i] == 1){
                answer += (char)('a' + i);
            }
        }
        return answer;
    }
}