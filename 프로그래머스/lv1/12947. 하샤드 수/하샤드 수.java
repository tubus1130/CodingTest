class Solution {
    public boolean solution(int x) {
        int temp = 0;
        int fakeX = x;
        while(fakeX > 0){
            temp += fakeX % 10;
            fakeX /= 10;
        }
        return x % temp == 0 ? true : false;
    }
}