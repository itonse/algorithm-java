class Solution {
    public int solution(String s) {
        int answer = 0;
        int len = s.length();

        int cntX = 0;
        int notX = 0;
        int p = 0;
        char x = s.charAt(p);
        while(p < len) {
            if (x == s.charAt(p)) {
                cntX++;
            } else {
                notX++;
            }
            if (cntX == notX) {
                answer++;
                cntX = 0;
                notX = 0;

                if (p == len - 1) {
                    break;
                }
                x = s.charAt(++p);
                System.out.println(p);
                continue;
            }
            p++;
        }
        
        if (cntX != notX) {
            answer++;
        }

        return answer;
    }
}