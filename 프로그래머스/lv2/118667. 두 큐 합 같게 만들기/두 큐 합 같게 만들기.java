import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = -2;
        Queue q1 = new LinkedList();
        Queue q2 = new LinkedList();

        long sumQ1 = 0;
        long sumQ2 = 0;

        for (int i = 0; i < queue1.length; i++) {
            q1.add(queue1[i]);
            sumQ1 += queue1[i];

            q2.add(queue2[i]);
            sumQ2 += queue2[i];
        }

        int cnt = 0;
        while (sumQ1 != sumQ2) {
            if (sumQ1 < sumQ2) {
                int tmp = (int) q2.poll();
                q1.add(tmp);
                sumQ2 -= tmp;
                sumQ1 += tmp;
            } else {
                int tmp = (int) q1.poll();
                q2.add(tmp);
                sumQ1 -= tmp;
                sumQ2 += tmp;
            }
            cnt++;
            
            if (cnt > queue1.length * 3) {
                cnt = -1;
                break;
            }
        }

        answer = cnt;
        return answer;
    }
}