class Solution {
    public int solution(int n) {
        Long[]dp = new Long[100001];
        dp[0] = 0L;
        dp[1] = 1L;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];

            if (dp[i] > 1234567) {
                dp[i] %= 1234567;
            }
        }

        return dp[n].intValue();
    }
}