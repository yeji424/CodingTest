class Solution {
    public int solution(int n) {
        int answer = n;
        int nCount = 0;
        int count = 0;
        
        String nBinaryString = Integer.toBinaryString(n);
        for (int i = 0; i < nBinaryString.length(); i++) {
            if (nBinaryString.charAt(i) == '1') {
                nCount++;
            }
        }
        
        while (answer > 0) {
            answer++;
            String binaryString = Integer.toBinaryString(answer);
            for (int i = 0; i < binaryString.length(); i++) {
                if (binaryString.charAt(i) == '1') {
                    count++;
                }
            }
            if (count == nCount) {
                break;
            }
            count = 0;
        }
        return answer;
    }
}