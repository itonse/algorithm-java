import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        Arrays.sort(arr);
        int cnt = arr[arr.length - 1];

        while (true) {
            boolean isLCM = true;

            for (int num : arr) {
                if (cnt % num != 0) {
                    isLCM = false;
                    break;
                }
            }
            
            if (isLCM) {
                return cnt;
            }
            cnt++;
        }
    }
}