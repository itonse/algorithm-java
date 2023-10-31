import java.util.PriorityQueue;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            if (i < k) {
                priorityQueue.offer(score[i]);
            } else {
                if (priorityQueue.peek() < score[i]) {
                    priorityQueue.poll();
                    priorityQueue.offer(score[i]);
                }
            }
            answer[i] = priorityQueue.peek();
        }

        return answer;
    }
}