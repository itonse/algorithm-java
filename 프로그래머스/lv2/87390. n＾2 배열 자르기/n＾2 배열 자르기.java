public class Solution {
    public static int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right - left) + 1];
        for (int i = 0; i < answer.length; i++) {
            long value = Math.max((left + i) / n, (left + i) % n) + 1;
            answer[i] = (int)value;
        }
        
        return answer;
    }
}