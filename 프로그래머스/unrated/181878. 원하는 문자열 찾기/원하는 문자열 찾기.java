class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        if(myString.length() < pat.length()){
            return 0;
        }
        int i = 0;
        int j = pat.length() - 1;
        while(j < myString.length()){
            String str = myString.substring(i, j+1);
            if(str.equals(pat)){
                return 1;
            }
            i++;
            j++;
        }
        return 0;
    }
}