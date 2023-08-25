class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        char[] arr = B.toCharArray();
        for(int i=0; i<arr.length; i++){
            String temp = "";
            if(arr[i] == A.charAt(0)){
                for(int j = i; j<arr.length; j++){
                    temp += arr[j];
                }
                for(int j=0; j<i; j++){
                    temp += arr[j];
                }
                if(temp.equals(A)){
                    return i;
                }
            }
        }
        return -1;
    }
}