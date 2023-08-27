class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long total = (long)count * (count+1) / 2 * price;
        if(total > money){
            return total - money;
        }else{
            return 0;
        }
    }
}