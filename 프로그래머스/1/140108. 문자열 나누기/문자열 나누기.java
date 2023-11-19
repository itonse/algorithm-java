class Solution {
    public int solution(String s) {
        int answer = 0;
        char target = s.charAt(0);
        int sameCnt = 0;
        int otherCnt = 0;

        for (int idx = 0; idx < s.length(); idx++) {
            if (s.charAt(idx) == target) {
                sameCnt++;
            } else {
                otherCnt++;
            }

            if (sameCnt == otherCnt) {
                answer++;
                sameCnt = 0;
                otherCnt = 0;

                if (idx < s.length() - 1) {
                    target = s.charAt(idx + 1);
                }
            }
        }

        if (sameCnt > 0) {
            answer++;
        }

        return answer;
    }
}