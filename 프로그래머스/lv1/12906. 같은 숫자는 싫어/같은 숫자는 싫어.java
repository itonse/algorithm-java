import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public int[] solution(int []arr) {
        Deque<Integer> deque = new LinkedList<>();

        deque.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (deque.peekLast() != arr[i]) {
                deque.addLast(arr[i]);
            }
        }

        int[] answer = new int[deque.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = deque.pollFirst();
        }

        return answer;
    }
}