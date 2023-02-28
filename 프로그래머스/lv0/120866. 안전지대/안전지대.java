class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[][] arr = new int[board.length + 2][board[0].length + 2];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 1) {
                    for (int k = i; k < i + 3; k++) {
                        for (int r = j; r < j + 3; r++) {
                            arr[k][r] = 1;
                        }
                    }
                }
            }
        }

        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 1; j < arr[0].length - 1; j++) {
                if (arr[i][j] == 0) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}