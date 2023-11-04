import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        int[] score = {0, 0, 0};
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i = 0; i < answers.length; i++) {
            if (p1[i % p1.length] == answers[i]) {
                score[0]++;
            }
            if (p2[i % p2.length] == answers[i]) {
                score[1]++;
            }
            if (p3[i % p3.length] == answers[i]) {
                score[2]++;
            }
        }

        int maxScore = Arrays.stream(score).max().getAsInt();
        List topRanks = new ArrayList();

        for (int i = 0; i < 3; i++) {
            if (score[i] == maxScore) {
                topRanks.add(i + 1);
            }
        }

        return topRanks.stream()
                .mapToInt(i -> (int)i)
                .toArray();
    }
}