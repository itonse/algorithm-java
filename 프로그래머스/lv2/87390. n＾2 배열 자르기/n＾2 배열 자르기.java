class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int) (right - left + 1)];

        int cnt = (int) (right - left) + 1;
        for (int i = 0; i < cnt; i++) {
            int col = (int) (left % n);
            int row = (int) (left / n);

            answer[i] = Math.max(col + 1, row + 1);
            left++;
        }
        
        return answer;
    }
}