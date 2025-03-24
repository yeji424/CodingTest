class Solution {
    public int solution(String s) {
        char[] arr = s.toCharArray();
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (index > 0 && arr[index - 1] == arr[i]) {
                index--;
            } else {
                arr[index] = arr[i];
                index++;
            }
        }

        if (index == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
