import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Arrays.fill(answer, -1);

        for (int i = 0; i < s.length(); i++) {
            int cnt = 0;
            for (int j = i - 1; j >= 0; j--) {
                cnt++;
                if (s.charAt(i) == s.charAt(j)) {
                    answer[i] = cnt;
                    break;
                }
            }
        }
        return answer;
    }
}