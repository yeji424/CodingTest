public class Solution {
    public int[] solution(int brown, int yellow) {
        int answer = brown + yellow;

        for (int height = 3; height <= answer; height++) {
            int width = answer / height;

            if (answer % height != 0) {
                continue;
            }

            if ((width - 2) * (height - 2) == yellow) {
                return new int[] {width, height};
            }
        }

        return new int[] {};
    }
}
