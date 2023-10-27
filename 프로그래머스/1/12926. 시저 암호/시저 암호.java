class Solution {
    public String solution(String s, int n) {
        String answer = "";

        for (char ch : s.toCharArray()) {
            if (ch != ' ') {
                if ('a' <= ch && ch <= 'z') {
                    answer += (char) ('a' + (ch - 'a' + n) % ('z' - 'a' + 1));
                } else {
                    answer += (char)('A' + (ch - 'A' + n) % ('Z' - 'A' + 1));
                }
            } else {
                answer += ch;
            }
        }
        return answer;
    }
}