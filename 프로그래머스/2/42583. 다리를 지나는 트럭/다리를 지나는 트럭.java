import java.util.LinkedList;
import java.util.Queue;

class Solution {   
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int sumWeight = 0;
        Queue<Integer> queue = new LinkedList<>();

        for (int curWeight : truck_weights) {
            while (true) {
                if (queue.isEmpty()) {
                    queue.add(curWeight);
                    sumWeight += curWeight;
                    answer++;
                    break;
                } else {
                    if (queue.size() == bridge_length) {
                        sumWeight -= queue.poll();
                    } else if (sumWeight + curWeight > weight) {
                        queue.add(0);
                        answer++;
                    } else {
                        queue.add(curWeight);
                        sumWeight += curWeight;
                        answer++;
                        break;
                    }
                }
            }
        }

        return answer + bridge_length;
    }
}