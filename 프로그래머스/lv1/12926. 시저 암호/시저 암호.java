class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == ' ') { 
                answer.append(c);
            } else if (c >= 'a' && c <= 'z') {
                char changedChar = (char) ((c - 'a' + n) % 26 + 'a');
                answer.append(changedChar);
            } else if (c >= 'A' && c <= 'Z') { 
                char changedChar = (char) ((c - 'A' + n) % 26 + 'A');
                answer.append(changedChar);
            }
        }

        return answer.toString();
    }
}