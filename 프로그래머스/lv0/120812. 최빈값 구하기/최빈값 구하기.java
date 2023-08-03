class Solution {
    public int solution(int[] array) {
        int[] numArr = new int[1000];
        
        for(int i=0; i<array.length; i++){
            numArr[array[i]]++;
        }
        
        int max = 0;
        int digit = 0;
        for(int i=0; i<numArr.length; i++){
            if(numArr[i] > max){
                max = numArr[i];
                digit = i;
            }else if(numArr[i] == max){
                digit = -1;
            }
        }
        
        return digit;
    }
}