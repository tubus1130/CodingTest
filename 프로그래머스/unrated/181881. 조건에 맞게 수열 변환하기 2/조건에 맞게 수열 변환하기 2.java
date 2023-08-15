class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        /* 
        1 2 3 100 99 98
        3 2 7 50 99 49
        7 2 15 25 99 99
        15 2 31 51 99 99
        31 2 63 51 99 99
        63 2 63 51 99 99
        */
        for(int i=0; i<arr.length; i++){
            int cnt = 0;
            while(true){
                if(arr[i] >= 50 && arr[i] % 2 == 0){
                    arr[i] /= 2;
                    cnt++;
                    continue;
                }else if(arr[i] < 50 && arr[i] % 2 == 1){
                    arr[i] = arr[i] * 2 + 1;
                    cnt++;
                    continue;
                }else{
                    break;
                }
            }
            if(cnt > answer){
                answer = cnt;
            }
        }
        return answer;
    }
}