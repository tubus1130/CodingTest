import java.util.Arrays;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        
        int[] arr = new int[7];
        arr[a]++;
        arr[b]++;
        arr[c]++;
        arr[d]++;
        int[] arrTemp = new int[7];
        for(int i=0; i<7; i++) {
        	arrTemp[i] = arr[i];
        }
        
        Arrays.sort(arr);
        int temp1 = 0;
        int temp2 = 0;
        int temp3 = 0;
        
        if(arr[6] == 4){
            answer = 1111 * a;
        }else if(arr[6] == 3){
            for(int i=6; i>0; i--){
                if(arrTemp[i] == 3){
                    temp1 = i;
                }else if(arrTemp[i] == 1){
                    temp2 = i;
                }
            }
            answer = (int)Math.pow(10*temp1+temp2, 2);
        }else if(arr[6] == 2){
            for(int i=6; i>0; i--){
                if(arrTemp[i] == 2){
                    if(temp1 == 0){
                        temp1 = i;
                    }else{
                        temp2 = i;
                    }
                }else if(arrTemp[i] == 1){
                    if(temp2 == 0){
                        temp2 = i;
                    }else{
                        temp3 = i;
                    }
                }
            }
            if(temp3 == 0){
                answer = (temp1 + temp2) * (temp1-temp2 > 0 ? temp1-temp2 : temp2-temp1);
            }else{
                answer = temp2 * temp3;
            }
        }else{
            for(int i=0; i<7; i++){
                if(arrTemp[i] == 1){
                    answer = i;
                    break;
                }
            }
        }
        
        return answer;
    }
}