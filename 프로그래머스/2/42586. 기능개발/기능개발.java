import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();

        int days = 0;

        Queue<int[]> queue  = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            queue.offer(new int[]{progresses[i], speeds[i]});
        }

        while (!queue.isEmpty()) {
            int[] target = queue.peek();

            int cnt = 0;
            int day = (int) Math.ceil((100.0 - target[0] - target[1] * days) / target[1]);
            days += day;

            while (!queue.isEmpty()) {
                if (queue.peek()[0] + queue.peek()[1] * days >= 100) {
                    queue.poll();
                    cnt++;
                } else {
                    break;
                }
            }

            answer.add(cnt);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}