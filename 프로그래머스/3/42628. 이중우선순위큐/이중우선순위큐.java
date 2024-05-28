import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = {0, 0};

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        int minHeapSize = 0;
        int maxHeapSize = 0;

        for (String operation : operations) {
            if (operation.startsWith("I")) {
                minHeap.add(Integer.parseInt(operation.split(" ")[1]));
                maxHeap.add(Integer.parseInt(operation.split(" ")[1]));

                minHeapSize++;
                maxHeapSize++;
            } else {
                int number = Integer.parseInt(operation.split(" ")[1]);

                if (number == 1 && maxHeapSize > 0) {
                    maxHeap.poll();
                } else if (minHeapSize > 0){
                    minHeap.poll();
                } else {
                    continue;
                }

                minHeapSize--;
                maxHeapSize--;
            }

            if (minHeapSize == 0 || maxHeapSize == 0) {
                minHeap.clear();
                maxHeap.clear();
            }
        }

        if (minHeapSize > 0 && maxHeapSize > 0) {
            answer[0] = maxHeap.peek();
            answer[1] = minHeap.peek();
        }

        return answer;
    }
}