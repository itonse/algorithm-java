class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            int cnt = 0;
            int sqrt = (int)Math.sqrt(i);

            for (int j = 1; j <= sqrt; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }

            cnt *= 2;
            if (Math.pow(sqrt, 2) == i) {
                cnt--;
            }

            if (cnt > limit) {
                answer += power;
            } else {
                answer += cnt;
            }
        }

        return answer;
    }
}