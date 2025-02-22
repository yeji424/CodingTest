class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 1;
        
        for(char c : s.toCharArray()){
            if(c == ' '){
                i = 1;
                sb.append(c);
            } else if(i == 1){
                sb.append(Character.toUpperCase(c));
                i = 0;
            } else{
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }
}