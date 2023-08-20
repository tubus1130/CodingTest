class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int digit = 0;
        int num = 0;
        String[] arr = polynomial.split(" ");
        
        for(String str : arr){
            if(str.contains("x")){
                if(str.equals("x")){
                    digit += 1;
                }else{
                    digit += Integer.parseInt(str.substring(0,str.length()-1));
                }
            }else if(str.equals("+")){
                
            }else{
                num += Integer.parseInt(str);
            }
        }
        
        if(digit != 0 && digit != 1){
            answer += String.valueOf(digit) + "x";
        }else if(digit !=0 && digit == 1){
            answer += "x";
        }
        if(num != 0 && !answer.equals("")){
            answer += " + " + String.valueOf(num);
        }else if(num != 0 && answer.equals("")){
            answer += String.valueOf(num);
        }
        
        return answer;
    }
}