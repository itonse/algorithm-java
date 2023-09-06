import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int cnt = Arrays.stream(arr).max().getAsInt();

        while(true) {
            boolean isLCM = true;

            for (int num: arr) {
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