class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pP_cnt = 0;
        int yY_cnt = 0;
        
        for(char ch: s.toCharArray()) {
            if(ch == 'y' || ch == 'Y') {
                yY_cnt++;
            }
            if(ch == 'p' || ch == 'P') {
                pP_cnt++;
            }
        }
        
        if(yY_cnt != pP_cnt) {
            answer = false;
        }

        return answer;
    }
}