class Solution {
    public int solution(int[][] dots) {
        int x1 = dots[0][0], y1 = dots[0][1], x2 = dots[1][0], y2 = dots[1][1], x3 = dots[2][0], y3 = dots[2][1], x4 = dots[3][0], y4 = dots[3][1];
        int answer = 0;
        
        double d1 = (double) (y2 - y1) / (x2 - x1);
        double d2 = (double) (y4 - y3) / (x4 - x3);
        if (d1 == d2) answer = 1;
        
        d1 = (double) (y3 - y1) / (x3 - x1);
        d2 = (double) (y2 - y4) / (x2 - x4);
        if (d1 == d2) answer = 1;
        
        d1 = (double) (y4 - y1) / (x4 - x1);
        d2 = (double) (y2 - y3) / (x2 - x3);
        if (d1 == d2) answer = 1;
        
        return answer;
    }
}