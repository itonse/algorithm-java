class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        answer[0] = gcd(n, m);
        answer[1] = lcm(n, m);
        
        return answer;
    }

    private int gcd(int n, int m) {
        int cnt = Math.min(n, m);
        while (cnt > 0) {
            if (n % cnt == 0 && m % cnt == 0) {
                return cnt;
            } else {
                cnt--;
            }
        }
        return 0;
    }

    private int lcm(int n, int m) {
        int cnt = Math.max(n, m);
        while (cnt <= n * m) {
            if (cnt % n == 0 && cnt % m == 0) {
                return cnt;
            } else {
                cnt++;
            }
        }
        return 0;
    }
}