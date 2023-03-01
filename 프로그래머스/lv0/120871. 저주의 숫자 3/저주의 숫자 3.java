class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = 0;
        int num;

        for(int i = 0; i < n; i++) {
            cnt++;
            if(cnt % 3 == 0 || String.valueOf(cnt).contains("3")) {
                i--;
            }
        }
        
        answer = cnt;
        return answer;
    }
}