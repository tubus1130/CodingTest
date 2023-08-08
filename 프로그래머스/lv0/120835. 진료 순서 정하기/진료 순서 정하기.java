import java.util.Arrays;
class Solution {
    public int[] solution(int[] emergency) {
        int[] arr = new int[emergency.length];
        for(int i=0; i<arr.length; i++){
            arr[i] = emergency[i];
        }
        int[] result = new int[emergency.length];
        Arrays.sort(emergency);
        int cnt = 1;
        for(int i=emergency.length-1; i>=0; i--){
            for(int j=0; j<arr.length; j++){
                if(emergency[i] == arr[j]){
                    result[j] = cnt++;;
                }
            }
        }
        return result;
    }
}