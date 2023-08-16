class Solution {
    public int solution(String my_string) {
        
        String[] arr = my_string.split(" ");
        int answer = Integer.parseInt(arr[0]);
        int status = 0;
        for(String str : arr){
            if(str.equals("+")){
                status = 1;
            }else if(str.equals("-")){
                status = 2;
            }else if(status == 1){
                answer += Integer.parseInt(str);
                status = 0;
            }else if(status == 2){
                answer -= Integer.parseInt(str);
                status = 0;
            }
        }
        return answer;
    }
}