class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;

        int max_garo = Integer.MIN_VALUE;
        int max_sero = Integer.MIN_VALUE;
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
            max_garo = Math.max(max_garo, sizes[i][0]);
            max_sero = Math.max(max_sero, sizes[i][1]);
        }

        answer = max_garo * max_sero;
        return answer;
    }
}