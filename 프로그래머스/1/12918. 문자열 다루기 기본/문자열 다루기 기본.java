class Solution {
    public boolean solution(String s) {
        boolean answer = true;

        if (s.length() > 6 || s.length() < 4 || s.length() == 5) {
            answer = false;
        }
        
        for (char ch : s.toCharArray()) {
            if (ch > '9' || ch < '0') {
                answer = false;
                break;
            }
        }

        return answer;
    }
}