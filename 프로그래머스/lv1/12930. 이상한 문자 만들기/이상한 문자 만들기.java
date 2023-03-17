class Solution {
    public String solution(String s) {
        String answer = "";
        boolean isBig;
        int cnt = 0;


        for (int i = 0; i < s.length(); i++) {
            isBig = true;
            if (s.charAt(i) - 'a' >= 0) {
                isBig = false;
            }

            if (s.charAt(i) == ' ') {
                answer += ' ';
                cnt = 0;
                continue;
            } else if(cnt % 2 == 0) {
                if (isBig) {
                    answer += s.charAt(i);
                } else {
                    answer += (char) (s.charAt(i) - 'a' + 'A');
                }
            } else {
                if (isBig) {
                    answer += (char) (s.charAt(i) - 'A' + 'a');
                } else {
                    answer += s.charAt(i);
                }
            }

            cnt++;
        }
        
        return answer;
    }
}