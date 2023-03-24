import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Deque<Integer> deque = new LinkedList<>();
        Queue<Integer> tmp = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            int remain = 100 - progresses[i];

            int days = 0;
            while (remain > 0) {
                remain -= speeds[i];
                days++;
            }

            if (i == 0) {
                deque.add(days);
            } else {
                if (deque.peekFirst() >= days) {
                    deque.addLast(days);
                } else {
                    tmp.add(deque.size());
                    deque.clear();
                    deque.add(days);
                }
            }
        }

        if (!deque.isEmpty()) {
            tmp.add(deque.size());
            deque.clear();
        }

        int[] answer = new int[tmp.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = tmp.poll();
        }
        return answer;
    }
}