import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack stack = new Stack();

        for (int i : moves) {
            int point = 0;
            int pick = 0;
            while (point < board.length) {
                if (board[point][i - 1] != 0) {
                    pick = board[point][i - 1];
                    board[point][i - 1] = 0;

                    if (!stack.isEmpty() && stack.peek().equals(pick)) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(pick);
                    }
                    break;
                } else {
                    point++;
                }
            }
        }

        return answer;
    }
}