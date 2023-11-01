class Solution {
    public String solution(int a, int b) {
        int[] dayOfMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dayOfWeek = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        int days = b;
        for (int i = 0; i < a - 1; i++) {
            days += dayOfMonth[i];
        }

        return dayOfWeek[(4 + days) % 7];
    }
}