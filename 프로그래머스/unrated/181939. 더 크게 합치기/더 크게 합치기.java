class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int temp1 = a * (int)Math.pow(10, len(b)) + b;
        int temp2 = b * (int)Math.pow(10, len(a)) + a;
        
        if(temp1 >= temp2){
            answer = temp1;
        }else{
            answer = temp2;
        }      
        return answer;
    }
    
    public int len(int data){
        int digit = 0;
        while(data > 0){
            if(data / 10 != 0){
                digit++;
            }
            data /= 10;
        }
        
        return ++digit;
    }
}