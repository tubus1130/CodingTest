class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] test1 = {1,2,3,4,5};
        int[] test2 = {2,1,2,3,2,4,2,5};
        int[] test3 = {3,3,1,1,2,2,4,4,5,5};
        int[] correct = new int[3];
        
        for(int i=0; i<answers.length; i++){
            if(answers[i] == test1[i%test1.length]){
                correct[0]++;
            }
            if(answers[i] == test2[i%test2.length]){
                correct[1]++;
            }
            if(answers[i] == test3[i%test3.length]){
                correct[2]++;
            }
        }
        int max = correct[0];
        int cnt = 1;
        for(int i=1; i<correct.length; i++){
            if(correct[i] == max){
                cnt++;
            }else if(correct[i] > max){
                max = correct[i];
                cnt = 1;
            }
        }
        int[] result = new int[cnt];
        int j=0;
        for(int i=0; i<correct.length; i++){
            if(correct[i] == max){
                result[j++] = i+1;
            }
        }
        
        return result;
    }
}

/*
1번 : 1,2,3,4,5
2번 : 2,1,2,3,2,4,2,5
3번 : 3,3,1,1,2,2,4,4,5,5

개수로 나머지연산

제일많이 맞춘갯수 정해서 그값이랑 같으면 배열에 담기
*/