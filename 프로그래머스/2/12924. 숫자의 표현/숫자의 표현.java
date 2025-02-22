class Solution {
    public int solution(int n) {
        int answer = 1;
        
        for(int k = 2; k * (k - 1) / 2 < n; k++){
            if((n - k * (k - 1) / 2) % k == 0){
                answer++;
            }
        }
        return answer;
    }
}