import java.util.Arrays;

class Solution {
    public int[] solution(int n, int s) {
        int[] answer = new int[n];
        int num = s / n;
        int remain = s % n;
        
        if (n > s) {
            int[] answer2 = {-1};
            return answer2;
        }
        
        if (num == 0) {
            int idx = n;
            while (remain > 0) {
                ++answer[--idx];
                remain--;
            }
        } else {
            Arrays.fill(answer, num);

            if (remain != 0) {
                int idx = n;
                while (remain > 0) {
                    ++answer[--idx];
                    remain--;
                }
            }
        }

        return answer;
    }
}