import java.util.Arrays;

class Solution {
    public long solution(long n) {
        char[] arr = Long.toString(n).toCharArray();
        Long answer = 0L;

        Arrays.sort(arr);
 
        for (int i = arr.length - 1; i >= 0; i--) {
            answer *= 10;
            answer += (int) (arr[i] - '0');
        }
        
        return answer;
    }
}