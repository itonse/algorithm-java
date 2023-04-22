import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue minHeap = new PriorityQueue();

        for (int i = 0; i < scoville.length; i++) {
            minHeap.offer(scoville[i]);
        }

        while (true) {
            int min1 = (int) minHeap.poll();
            if (min1 >= K) {
                break;
            } else {
                if (!minHeap.isEmpty()) {
                    int min2 = (int) minHeap.poll();
                    minHeap.offer(min1 + (min2 * 2));
                    answer++;
                } else {
                    return -1;
                }
            }
        }

        return answer;
    }
}