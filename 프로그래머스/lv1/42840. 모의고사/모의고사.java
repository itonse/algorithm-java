import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
       int maxCnt = 0;

        int[] num1 = {1, 2, 3, 4, 5};
        int[] num2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] num3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int ans1 = 0;
        int ans2 = 0;
        int ans3 = 0;

        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == num1[cnt1]) {
                ans1++;
            }

            if (answers[i] == num2[cnt2]) {
                ans2++;
            }

            if (answers[i] == num3[cnt3]) {
                ans3++;
            }

            cnt1 = ++cnt1 % num1.length;
            cnt2 = ++cnt2 % num2.length;
            cnt3 = ++cnt3 % num3.length;

            if (i == answers.length - 1) {
                maxCnt = Math.max(maxCnt, ans1);
                maxCnt = Math.max(maxCnt, ans2);
                maxCnt = Math.max(maxCnt, ans3);
            }
        }

        List<Integer> list = new ArrayList<>();

        if (ans1 == maxCnt) {
            list.add(1);
        }

        if (ans2 == maxCnt) {
            list.add(2);
        }

        if (ans3 == maxCnt) {
            list.add(3);
        }

        return list.stream().mapToInt(i -> (int) i).toArray();
    }
}