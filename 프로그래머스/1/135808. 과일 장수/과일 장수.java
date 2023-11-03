import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);

        int idx = score.length;
        while(idx >= m) {
            idx -= m;
            answer += score[idx] * m;
        }

        return answer;
    }
}