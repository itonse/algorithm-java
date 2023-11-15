import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        HashSet<Integer> set = new HashSet();
        for (int num : win_nums) {
            set.add(num);
        }

        int winCnt = 0;
        int zeroCnt = 0;
        for (int num : lottos) {
            if (num == 0) {
                zeroCnt++;
            } else if (set.contains(num)) {
                winCnt++;
            }
        }
        
        int[] answer = {7 - (winCnt + zeroCnt), winCnt};

        answer[0] = 7 - (winCnt + zeroCnt) <= 6 ? 7 - (winCnt + zeroCnt) : 6;
        answer[1] = 7 - winCnt <= 6 ? 7 - winCnt : 6;

        return answer;
    }
}