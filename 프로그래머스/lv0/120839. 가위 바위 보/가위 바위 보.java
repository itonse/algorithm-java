class Solution {
    public String solution(String rsp) {
        String answer = "";
        char[] charList = rsp.toCharArray();

        for(char ch: charList) {
            if (ch == '2') {
                answer += '0';
            } else if (ch == '0') {
                answer += '5';
            } else if (ch == '5') {
                answer += '2';
            }
        }
       
        return answer;
    }
}