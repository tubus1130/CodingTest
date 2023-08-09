class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String arr[] = letter.split(" ");
        String morse[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<morse.length; j++){
                if(arr[i].equals(morse[j])){
                    answer += (char)(j + 49 + '0');
                }
            }
        }
        return answer;
    }
}