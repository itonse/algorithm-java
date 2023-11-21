class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder(s);

        for (int idx = 0; idx < sb.length(); idx++) {
            if ((idx == 0) || (sb.charAt(idx - 1) == ' ')) {
                if ('a' <= sb.charAt(idx) && sb.charAt(idx) <= 'z') {
                    sb.setCharAt(idx, (char) (sb.charAt(idx) - 'a' + 'A'));
                }
            } else if ('A' <= sb.charAt(idx) && sb.charAt(idx) <= 'Z') {
                sb.setCharAt(idx, (char) (sb.charAt(idx) - 'A' + 'a'));
            }
        }

        return sb.toString();
    }
}