class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            int cnt = 0;
            while (i + cnt + 1 < prices.length) {
                if (prices[i] <= prices[i + cnt + 1]) {
                    cnt++;
                } else {
                    cnt++;
                    break;
                }
            }
            answer[i] = cnt;
        }

        return answer;
    }
}