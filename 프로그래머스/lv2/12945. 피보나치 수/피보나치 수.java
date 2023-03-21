class Solution {
    public int solution(int n) {
        int before1 = 0;
        int before2 = 1;
        int answer = 0;

        for (int i = 2; i <= n; i++) {
            answer = (before1 + before2) % 1234567;
            before1 = before2;
            before2 = answer;
        }
        
        return answer;
    }
}