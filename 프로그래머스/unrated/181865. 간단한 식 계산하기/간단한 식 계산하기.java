class Solution {
    public int solution(String binomial) {
        int answer = 0;
        
        String[] arr = binomial.split(" ");
        int num1 = Integer.parseInt(arr[0]);
        int num2 = Integer.parseInt(arr[2]);
        if(arr[1].equals("+")){
            answer = num1 + num2;
        }else if(arr[1].equals("-")){
            answer = num1 - num2;
        }else if(arr[1].equals("*")){
            answer = num1 * num2;
        }
        return answer;
    }
}