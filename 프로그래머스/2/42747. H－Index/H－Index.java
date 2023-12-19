import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int max = 0;
                          
        Arrays.sort(citations);   

        int cnt = 1;
        for (int i = citations.length - 1; i >= 0; i--) {
            if (citations[i] <= cnt) {
                max = Math.max(max, Math.min(citations[i], cnt));
            } else {
                max = Math.max(max, cnt);
            }

            cnt++;
        }

        return max;
    }
}