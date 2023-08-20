import java.util.*;
class Solution {
    public int solution(int[][] dots) {
        List<Integer> listX = new ArrayList<>();
        List<Integer> listY = new ArrayList<>();
        for(int[] dot : dots){
            if(!listX.contains(dot[0])){
                listX.add(dot[0]);
            }
            if(!listY.contains(dot[1])){
                listY.add(dot[1]);
            }
        }
        int width = Math.abs(listX.get(0) - listX.get(1));
        int height = Math.abs(listY.get(0) - listY.get(1));
        return width * height;
    }
}