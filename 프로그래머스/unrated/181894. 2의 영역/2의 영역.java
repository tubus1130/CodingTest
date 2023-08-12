class Solution {
    public int[] solution(int[] arr) {
        /*
        투포인터
        i j
        2찾을때까지 i++
        2찾을때까지 j--
        i,j배열출력
        
        i==j
        2출력
        
        i>j
        -1출력
        */
        
        int i = 0;
        int j = arr.length-1;
        int status = -1;
        
        while(i < j){
            if(arr[i] != 2){
                i++;
            }
            if(arr[j] != 2){
                j--;
            }
            if(arr[i] == 2 && arr[j] == 2){
                status = 1;
                break;
            }
        }
        if(i==j && arr[i] == 2){
            status = 2;
        }
        
        if(status == -1){
            int[] answer = {-1};
            return answer;
        }else if(status == 2){
            int[] answer = {2};
            return answer;
        }else{
            int[] answer = new int[j-i+1];
            for(int idx=0; idx<answer.length; idx++){
                answer[idx] = arr[i++];
            }
            return answer;
        }
    }
}