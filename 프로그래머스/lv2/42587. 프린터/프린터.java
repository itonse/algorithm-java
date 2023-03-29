import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        Queue<Integer> queue = new LinkedList<>();
        for (int i: priorities) {
            queue.add(i);   // {2, 1, 1, 3, 2}
        }

        Arrays.sort(priorities);  // {1, 1, 2, 2, 3}
        int len = priorities.length;
        int max = priorities[len - 1];

        int cnt = 0;
        int loc = location;
        while (true) {
            //System.out.println("**" + queue.peek());
            if (queue.peek() < max) {
                int tmp = queue.poll();
                queue.add(tmp);

                if (loc == 0) {
                    loc = queue.size() - 1;
                } else {
                    loc--;
                }
            } else {
                queue.remove();
                answer++;

                if (loc == 0) {
                    break;
                } else {
                    loc--;
                }
                max = priorities[len - 1 - ++cnt];
            }
        }

        return answer;
    }
}