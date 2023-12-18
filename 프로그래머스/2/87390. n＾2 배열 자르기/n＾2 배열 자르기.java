class Solution {   
    public long[] solution(int n, long left, long right) {
        long[] answer = new long[(int) (right - left + 1)];

        int cnt = 0;
        for(long idx = left; idx <= right; idx++) {
            answer[cnt++] = Math.max(idx / n + 1, idx % n + 1);
        }

        return answer;
    }
}