import java.util.*;

class Solution {
    public int solution(int[] elements) {
        HashSet<Integer> sumSet = new HashSet<>();
        int n = elements.length;

        int[] cs = new int[n * 2];
        for (int i = 0; i < n * 2; i++) {
            cs[i] = elements[i % n];
        }

        for (int length = 1; length <= n; length++) {
            for (int start = 0; start < n; start++) {
                int sum = 0;
                for (int i = 0; i < length; i++) {
                    sum += cs[start + i];
                }
                sumSet.add(sum);
            }
        }

        return sumSet.size();
    }
}