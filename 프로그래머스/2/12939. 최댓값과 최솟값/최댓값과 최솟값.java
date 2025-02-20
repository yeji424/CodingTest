class Solution {
    public String solution(String s) {
        String[] answer = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < answer.length; i++){
            int value = Integer.parseInt(answer[i]);
            
            if(value < min){
                min = value;
            }
            if(value > max){
                max = value;
            }
        }
        return (min + " " + max);
    }
}