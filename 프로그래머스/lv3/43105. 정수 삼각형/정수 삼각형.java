class Solution {
    public int solution(int[][] triangle) {
        int[][] dp = new int[triangle.length][triangle[triangle.length - 1].length];

        dp[0][0] = triangle[0][0];

        int max = 0;
        for (int i = 1; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                if (j == 0) {
                    dp[i][j] = dp[i - 1][0] + triangle[i][j];
                } else if (j == (triangle[i].length - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + triangle[i][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + triangle[i][j];
                }

                if (i == triangle.length - 1) {
                    max = Math.max(max, dp[i][j]);
                }
            }
        }

        int answer = max;
        return answer;
    }
}