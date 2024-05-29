class Solution {
    public int solution(int n, int k) {
        int answer = 0;

        String[] result = change(n, k).split("0");

        for (String str : result) {
            if (!str.isEmpty() && isPrime(Long.parseLong(str))) {
                answer++;
            }
        }

        return answer;
    }

    public String change (int num, int k) {
        StringBuilder sb = new StringBuilder();

        int current = num;

        while (current > 0) {
            sb.append(current % k);
            current /= k;
        }

        return sb.reverse().toString();
    }

    public boolean isPrime(long n) {
        if (n <= 1) {
            return false;
        }

        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}