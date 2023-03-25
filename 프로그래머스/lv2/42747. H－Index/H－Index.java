import java.util.Arrays;

class Solution {
    public static int solution(int[] citations) {
        Arrays.sort(citations);
        int len = citations.length;

        int max = 0;
        for (int i = 1; i <= len; i++) {  
            if (i <= citations[len - i]) {  
                max = i;
            } else {
                break;
            }
        }
        
        return max;
    }
}