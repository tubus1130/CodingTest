class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int r1 = arr1.length;
        int c1 = arr1[0].length;
        int r2 = arr2.length;
        int c2 = arr2[0].length;
        
        int[][] answer = new int[r1][c2];
        
        for(int i=0; i<r1; i++){
            for(int j=0; j<c2; j++){
                for(int k=0; k<c1; k++){
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        
        return answer;
    }
}

/*
정답 행렬 크기 구하기
반복문으로 곱셈
[0,0]
0,0 0,0
0,1 1,0
0,2 2,0

[0,1]
0,0 0,1
0,1 1,1
0,2 2,1

[0,2]
0,0 0,2
0,1 1,2
0,2 2,2
*/