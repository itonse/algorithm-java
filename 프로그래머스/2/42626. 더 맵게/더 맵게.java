import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (int n : scoville) {
            heap.add(n);
        }

        while (heap.size() >= 2 && heap.peek() < K) {
            int n1 = heap.poll();
            int n2 = heap.poll() * 2;

            heap.add(n1 + n2);
            answer++;
        }

        if (heap.size() <= 1 && heap.peek() < K) {
            return -1;
        } else {
            return answer;
        }
    }
}