class Solution {
    public int solution(int[][] sizes) {
    int max_garo = 0;
    int max_sero = 0;

    for (int[] size : sizes) {
        int larger = Math.max(size[0], size[1]);
        int smaller = Math.min(size[0], size[1]);

        max_garo = Math.max(max_garo, larger);
        max_sero = Math.max(max_sero, smaller);
    }

    return max_garo * max_sero;
}
}