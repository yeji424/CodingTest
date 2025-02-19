class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int [] arr = new int [100 - (-100) + 1];
        
        for (int i = 0; i < lines.length; i++) {
             int first = lines[i][0] + 100;
             int last = lines[i][1] + 100;

            for (int j = first; j < last; j++) {
                arr[j]++;
            }
        }

        for(int i = 0; i < 200; i++){
            if(arr[i]  >= 2){
                answer ++;
            }
        }
        return answer;
    }
}