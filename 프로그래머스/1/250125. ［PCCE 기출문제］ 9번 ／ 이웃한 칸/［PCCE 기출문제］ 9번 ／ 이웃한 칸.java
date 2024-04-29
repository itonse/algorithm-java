class Solution {
    public int solution(String[][] board, int h, int w) {
        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0, 0, -1};
        int n = board.length;
        int count = 0;

        for (int i = 0; i < 4; i++) {
            int curH = h + dh[i];
            int curW = w + dw[i];

            if ((curH >= 0 && curH < n) && (curW >= 0 && curW < n)) {
                if (board[h][w].equals(board[curH][curW])) {
                    count += 1;
                }
            }
        }

        return count;
    }
}