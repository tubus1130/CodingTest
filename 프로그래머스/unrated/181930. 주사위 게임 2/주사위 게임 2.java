class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int[] temp = new int[7];
        temp[a]++;
        temp[b]++;
        temp[c]++;
        
        for(int i=0; i<temp.length; i++){
            if(temp[i] == 3){
                answer += (a + b + c) * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)) * (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
                break;
            }else if(temp[i] == 2){
                answer += (a + b + c) * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
                break;
            }else{
                if(i==temp.length - 1){
                    answer += a + b + c;
                }
            }
        }
        
        return answer;
    }
}