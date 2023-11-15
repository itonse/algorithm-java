import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        HashSet<Integer> set = new HashSet();
        
        for (int num : win_nums) {
            set.add(num);
        }

        int winCnt = 0;
        int zeroCnt = 0;
        for (int num : lottos) {
            if (num == 0) {
                zeroCnt++;
                continue;
            }
            if (set.contains(num)) {
                winCnt++;
            }
        }

        answer[0] = 7 - (winCnt + zeroCnt);
        answer[1] = 7 - winCnt;

        if (answer[0] > 6) {
            answer[0] = 6;
        }
        if (answer[1] > 6) {
            answer[1] = 6;
        }

        return answer;
    }
}