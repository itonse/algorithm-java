class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        String tmp = "";
        
        for(int i = 0; i <= t.length() - p.length(); i++) {
            tmp = "";
            for(int j = i; j < i + p.length(); j++) {
                tmp += t.charAt(j);
            }
            if(Long.parseLong(p) >= Long.parseLong(tmp)) {
                answer++;
            }
        }
        
        return answer;
    }
}