import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        
        Arrays.sort(tangerine);
        List<Integer> cnt = new ArrayList<>();
        int sizeCnt = 1;
        
        for(int i = 1; i < tangerine.length; i++){
            if(tangerine[i] == tangerine[i - 1])
                sizeCnt++;
            else{
                cnt.add(sizeCnt);
                sizeCnt = 1;
            }
        }
        cnt.add(sizeCnt);
        cnt.sort(Comparator.reverseOrder());
        
        int sum = 0, answer = 0;
        
        for(int i : cnt){
            sum += i;
            answer++;
            
            if(sum >= k)
                break;
        }
        
        return answer;
    }
}