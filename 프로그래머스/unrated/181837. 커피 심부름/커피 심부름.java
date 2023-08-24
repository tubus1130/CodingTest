class Solution {
    public int solution(String[] order) {
        int answer = 0;
        int amer = 0;
        int latte = 0;
        for(String str : order){
            if(str.contains("americano")){
                amer++;
            }else if(str.contains("cafelatte")){
                latte++;
            }else{
                amer++;
            }
        }
        return amer * 4500 + latte * 5000;
    }
}