class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == ' ') {
                answer.append(' ');
            } else if ('a' <= ch && ch <= 'z') {
                answer.append((char) ('a' + (ch + n - 'a') % 26));
            } else if ('A' <= ch && ch <= 'Z') {
                answer.append((char) ('A' + (ch + n - 'A') % 26));
            }
        }

        return answer.toString();
    }
}