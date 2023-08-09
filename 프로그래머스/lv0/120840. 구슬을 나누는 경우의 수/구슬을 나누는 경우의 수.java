class Solution {
    public int solution(int balls, int share) {
        return comb(balls, share);
    }
    
    public int comb(int n, int m) {
        if(n==m || m == 0) return 1;
        return comb(n-1, m-1) + comb(n-1, m);
    }
}