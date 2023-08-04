class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        boolean flag = true;
        if(ineq.equals("<")){
            if(eq.equals("=")){
                flag = n <= m;
            }else{
                flag = n < m;
            }
        }else{
            if(eq.equals("=")){
                flag = n >= m;
            }else{
                flag = n > m; 
            }
        }
        if(flag == true){
            answer = 1;
        }else{
            answer = 0;
        }
        return answer;
    }
}