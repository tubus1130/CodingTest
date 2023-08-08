class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        
        char[] arr = my_string.toCharArray();
        
        for(int[] query : queries){
            int i = query[0];
            int j = query[1];
            while(i < j){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            
        }
        
        for(int i=0; i<arr.length; i++){
            answer += arr[i];
        }
        
        return answer;
    }
}