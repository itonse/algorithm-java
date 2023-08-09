class Solution {
    public int solution(String s) {
        int answer = 1;

        if (s.length() <= 1)
            return 1;

        for (int i = 1; i < s.length(); i++) { 
            if (s.charAt(i) == s.charAt(i - 1)) { 
                answer = Math.max(answer, countPalindrome(s, i - 1, i));
            }

            if (i > 1 && s.charAt(i) == s.charAt(i - 2)) { 
                answer = Math.max(answer, countPalindrome(s, i - 2, i));
            }
        }

        return answer;
    }

    private int countPalindrome(String s, int idx1, int idx2) {
        while (idx1 >= 0 && idx2 < s.length() && s.charAt(idx1) == s.charAt(idx2)) {
            --idx1;
            ++idx2;
        }

        return idx2 - idx1 - 1;
    }
}