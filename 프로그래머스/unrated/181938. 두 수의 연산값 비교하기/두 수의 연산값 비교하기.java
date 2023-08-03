class Solution {
    public int solution(int a, int b) {
        
        int temp1 = Integer.parseInt(a+""+b);
        int temp2 = 2 * a * b;
        
        return temp1>=temp2?temp1:temp2;
    }
}