class Solution {
    public int solution(int n) {
        return Integer.parseInt(decimalToTernary(n), 3);
    }

    public String decimalToTernary(int num) {
        String ternary = "";

        while (num > 0) {
            ternary += (char)(num % 3 + '0');
            num /= 3;
        }

        return ternary;
    }
}