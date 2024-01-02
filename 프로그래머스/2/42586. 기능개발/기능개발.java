import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int idx = 0; idx < progresses.length; idx++) {
            int day = (int) Math.ceil((100.0 - progresses[idx]) / speeds[idx]);
            queue.add(day);
        }

        int cnt = 0;
        int target = queue.peek();

        for (int i = 0; i < progresses.length; i++) {
            int day = queue.poll();

            if (target >= day) {
                cnt++;
            } else {
                answer.add(cnt);
                cnt = 1;
                target = day;
            }
        }

        answer.add(cnt);

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}