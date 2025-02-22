class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int cnt = 0;
        
        for(char c : s.toCharArray()){
            if(c == '('){
                cnt++;
            } else{
                cnt--;
                if(cnt < 0){
                    answer = false;
                    break;
                }
            }
        }
        if(cnt != 0){
            answer = false;
        }
        return answer;
    }
}