class Solution {
    public int solution(int n, int a, int b) {
        int round = 1;
        int lower = Math.min(a, b);
        int higher = Math.max(a, b);

        while (!(lower + 1 == higher && lower % 2 == 1)) {
            lower = match(lower);
            higher = match(higher);
            round++;
        }

        return round;
    }

    private int match(int n) {
        if (n % 2 == 0) {
            n /= 2;
        } else {
            n = n / 2 + 1;
        }
        return n;
    }
}