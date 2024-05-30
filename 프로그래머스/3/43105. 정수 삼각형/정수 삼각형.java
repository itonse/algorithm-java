class Solution {
    public int solution(int[][] triangle) {
        int[][] dp = new int[triangle.length][];

        dp[0] = new int[1];
        dp[0][0] = triangle[0][0];

        for (int i = 1; i < triangle.length; i++) {
            dp[i] = new int[triangle[i].length];
            for (int j = 0; j < triangle[i].length; j++) {
                if (j == 0) {
                    dp[i][j] = dp[i - 1][j] + triangle[i][j];
                } else if (j == dp[i].length - 1) {
                    dp[i][j] = dp[i - 1][j - 1] + triangle[i][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - 1])  + triangle[i][j];
                }
            }
        }

        int max = 0;
        for (int i : dp[dp.length - 1]) {
            max = Math.max(max, i);
        }

        return max;
    }
}