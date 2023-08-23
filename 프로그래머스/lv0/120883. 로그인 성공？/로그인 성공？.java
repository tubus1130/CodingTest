class Solution {
    public String solution(String[] id_pw, String[][] db) {
        for(String[] str : db){
            if(id_pw[0].equals(str[0]) && id_pw[1].equals(str[1])){
                return "login";
            }else if(id_pw[0].equals(str[0])){
                return "wrong pw";
            }
        }
        return "fail";
    }
}