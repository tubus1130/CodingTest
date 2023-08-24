import java.util.*;
class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        if(bin1.length() < bin2.length()){
            String temp = bin1;
            bin1 = bin2;
            bin2 = temp;
        }
        List<Integer> list = new ArrayList<>();
        char[] arr1 = bin1.toCharArray();
        char[] arr2 = bin2.toCharArray();
        
        int temp = 0;
        
        for(int i=arr2.length-1; i>=0; i--){
            int num1 = arr1[i+arr1.length-arr2.length] - '0';
            int num2 = arr2[i] - '0';
            int total = num1 + num2 + temp;
            if(total > 1){
                temp = 1;
            }else{
                temp = 0;
            }
            list.add(total % 2);
        }
        
        for(int i=arr1.length - arr2.length - 1; i>=0; i--){
            int num1 = arr1[i] - '0';
            int total = num1 + temp;
            if(total > 1){
                temp = 1;
            }else{
                temp = 0;
            }
            list.add(total % 2);
        }
        if(temp == 1){
            list.add(temp);
        }
        for(int i=list.size()-1; i>=0; i--){
            answer += String.valueOf(list.get(i));
        }
        
        return answer;
    }
}