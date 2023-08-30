class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int[][] map1 = new int[n][n];
        int[][] map2 = new int[n][n];
        
        for(int i=0; i<arr1.length; i++){
            int idx = 0;
            while(arr1[i] > 0){
                map1[i][arr1.length-1-idx] = arr1[i] % 2;
                arr1[i] /= 2;
                idx++;
            }
        }
        for(int i=0; i<arr2.length; i++){
            int idx = 0;
            while(arr2[i] > 0){
                map2[i][arr2.length-1-idx] = arr2[i] % 2;
                arr2[i] /= 2;
                idx++;
            }
        }
        
        for(int i=0; i<map1.length; i++){
            String temp = "";
            for(int j=0; j<map1[0].length; j++){
                if(map1[i][j] + map2[i][j] == 0){
                    temp += " ";
                }else{
                    temp += "#";
                }
            }
            answer[i] = temp;
        }
        return answer;
    }
}