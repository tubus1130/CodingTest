class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int idx=0;
        for(String str : quiz){
            String[] arr = str.split(" ");
            int num1 = Integer.parseInt(arr[0]);
            int num2 = Integer.parseInt(arr[2]);
            int result = Integer.parseInt(arr[4]);
            
            if(arr[1].equals("+")){
                answer[idx++] = num1+num2==result ? "O" : "X";
            }else if(arr[1].equals("-")){
                answer[idx++] = num1-num2==result ? "O" : "X";
            }
        }
        return answer;
    }
}