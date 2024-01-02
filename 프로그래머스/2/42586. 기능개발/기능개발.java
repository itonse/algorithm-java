import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();

        int target = 0;
        int days = 0;

        while (target < progresses.length) {
            int cnt = 0;
            int day = (int) Math.ceil((100 - progresses[target] - speeds[target] * days) / (double)speeds[target]);
            day = day <= 0 ? 1 : day;
            days += day;

            while (target + cnt < progresses.length) {
                if (progresses[target + cnt] + speeds[target + cnt] * days >= 100) {
                    cnt++;
                } else {
                    break;
                }
            }

            target += cnt;
            answer.add(cnt);
        }

        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}