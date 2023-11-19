class Solution {
    public int solution(String s) {
        int answer = 0;
        char target = 0;
        int sameCnt = 0;

        for (char ch : s.toCharArray()){
            if (sameCnt == 0) {
                target = ch;
            }

            if (ch == target) {
                sameCnt++;
            } else {
                sameCnt--;
            }

            if (sameCnt == 0) {
                answer++;
            }
        }

        if (sameCnt > 0) {
            answer++;
        }

        return answer;
    }
}