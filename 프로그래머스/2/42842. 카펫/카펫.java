class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int sero = 1;
        int garo = yellow;
        while (sero <= yellow) {
            if (yellow % sero == 0) {
                garo = yellow / sero;

                if ((garo + 2) * 2 + (sero * 2) == brown) {
                    answer[0] = (garo + 2);
                    answer[1] = (sero + 2);
                    break;
                }
            }
            sero++;
        }
        return answer;
    }
}