class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        for (int i = yellow; i > 0; i--) {
            if (yellow % i != 0) {
                continue;
            }

            int col = i;
            int row = yellow / col;

            if ((col + 2) * (row + 2) - col * row == brown) {
                answer[0] = col + 2;
                answer[1] = row + 2;
                break;
            }
        }
        return answer;
    }
}