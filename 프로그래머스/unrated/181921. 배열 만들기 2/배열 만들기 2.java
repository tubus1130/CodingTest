import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        
        for(int i=l; i<=r; i++){
            String temp = Integer.toString(i);
            int j = 0;
            while(j < temp.length()){
                if(temp.charAt(j) != '5' && temp.charAt(j) != '0'){
                    break;
                }
                
                if(j == temp.length()-1){
                    list.add(Integer.parseInt(temp));
                }
                j++;
            }
        }
        if(list.size() == 0){
            list.add(-1);
        }
        
        int[] result = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
    }
}