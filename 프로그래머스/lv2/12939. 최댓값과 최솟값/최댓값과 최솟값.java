import java.util.*;
class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        int[] temp = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            temp[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(temp);
        return temp[0] + " " + temp[temp.length-1];
    }
}