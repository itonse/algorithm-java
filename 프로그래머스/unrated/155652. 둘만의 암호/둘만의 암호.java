import java.util.HashSet;

class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        HashSet<Character> skipSet = new HashSet<>();

        for (char c : skip.toCharArray()) {
            skipSet.add(c);
        }

        for (char ch : s.toCharArray()) {
            int idx = 0;
            while (idx < index) {
                ch = ch == 'z' ? 'a' : (char) (ch + 1);
                if (!skipSet.contains(ch)) {
                    idx++;
                }
            }
            answer.append(ch);
        }
        
        return answer.toString();
    }
}