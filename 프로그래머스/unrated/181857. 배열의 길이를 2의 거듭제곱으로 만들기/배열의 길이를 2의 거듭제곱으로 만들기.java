class Solution {
    public int[] solution(int[] arr) {
        
        /*
        1 1
        2 2   1
        3 4   1 ... 1
        4 4   2
        5 8   2 ... 1
        6 8   3
        7 8   3 ... 1
        8 8   4 ... 0
        */
        int idx = 0;
        while(arr.length > (int)Math.pow(2, idx)){
            idx++;
        }
        int[] answer = new int[(int)Math.pow(2, idx)];
        for(int i=0; i<arr.length; i++){
            answer[i] = arr[i];
        }
        return answer;
    }
}