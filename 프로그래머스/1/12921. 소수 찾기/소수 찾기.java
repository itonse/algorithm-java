import java.util.Arrays;

class Solution {
    public int solution(int n) {
        int answer = 0;

        int[] number = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            if (number[i] == 1) {
                continue;
            } else {
                for (int j = i * 2; j <= n; j += i) {
                    number[j] = 1;
                }
            }
        }

        for (int i = 2; i < number.length; i++) {
            if (number[i] == 0) {
                answer++;
            }
        }

        return answer;
    }
}