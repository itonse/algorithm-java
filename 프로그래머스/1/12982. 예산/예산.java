import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);

        while(budget > 0 && answer < d.length) {
            budget -= d[answer];

            if (budget >= 0) {
                answer++;
            }
        }

        return answer;
    }
}