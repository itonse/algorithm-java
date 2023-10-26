class Solution {
    public int solution(int[][] sizes) {
        int longMax = 0;
        int sortMax = 0;

        for (int i = 0; i < sizes.length; i++) {
            longMax = Math.max(longMax, Math.max(sizes[i][0], sizes[i][1]));
            sortMax = Math.max(sortMax, Math.min(sizes[i][0], sizes[i][1]));
        }
        return longMax * sortMax;
    }
}