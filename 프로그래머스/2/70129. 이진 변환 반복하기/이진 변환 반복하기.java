class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int cnt = 0, zeroCnt = 0;
        
        while(!s.equals("1")){
            StringBuilder sb = new StringBuilder();
            
            for(char c : s.toCharArray()){
                if(c == '0'){
                    zeroCnt++;
                } else{
                    sb.append(c);
                }
            }
            
            s = Integer.toBinaryString(sb.length());
            cnt++;
        }
        answer[0] = cnt; 
        answer[1] = zeroCnt; 
        
        return answer;
    }
}