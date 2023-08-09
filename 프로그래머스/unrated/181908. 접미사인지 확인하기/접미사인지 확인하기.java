class Solution {
    public int solution(String my_string, String is_suffix) {
        String[] arr = new String[my_string.length()];
        for(int i=0; i<my_string.length(); i++){
            arr[i] = my_string.substring(i);
        }
        for(int i=0; i<my_string.length(); i++){
            if(is_suffix.equals(arr[i])){
                return 1;
            }
        }
        return 0;
    }
}