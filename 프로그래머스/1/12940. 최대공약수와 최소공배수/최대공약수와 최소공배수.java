class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        gcd(n, m, answer);
        lcm(n, m, answer);

        return answer;
    }

    public void gcd(int n, int m, int[] ans) {   // 최대공약수
        int min = Math.min(n, m);
        for (int i = min; i >= 1; i--) {
            if (n % i == 0 && m % i == 0) {
                ans[0] = i;
                break;
            }
        }
    }

    public void lcm(int n, int m, int[] ans) {     // 최소공배수
        int max = Math.max(n, m);
        for (int i = max; i <= n * m; i++) {
            if (i % n == 0 && i % m == 0) {
                ans[1] = i;
                break;
            }
        }
    }
}