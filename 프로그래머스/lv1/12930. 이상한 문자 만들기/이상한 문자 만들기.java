class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        int cnt = 0;
        
        for (String ss: arr) {
            cnt = ss.equals(" ") ? 0 : cnt + 1;
            answer += cnt % 2 == 1 ? ss.toUpperCase() : ss.toLowerCase();
        }
        
        return answer;
    }
}