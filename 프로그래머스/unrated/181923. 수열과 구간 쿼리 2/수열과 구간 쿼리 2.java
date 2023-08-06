class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int cnt = 0;
        for(int[] query : queries){
            int s = query[0];
            int e = query[1];
            int k = query[2];
            
            int max = 1_000_000;
            for(int j=s; j<=e; j++){
                if(arr[j] > k && arr[j] < max){
                    max = arr[j];
                }
            }
            if(max == 1_000_000){
                answer[cnt] = -1;
            }else{
                answer[cnt] = max;
            }
            cnt++;
        }
        
        return answer;
    }
}