class Solution {
    public int solution(int n) {
        int answer = 1;

        for (int i = 1; i <= n / 2; i++) {
            int num = i;
            int sum = 0;

            while (sum < n) {
                sum += num;
                num++;
            }

            if (sum == n) {
                answer++;
            }
        }
        
        return answer;
    }
}