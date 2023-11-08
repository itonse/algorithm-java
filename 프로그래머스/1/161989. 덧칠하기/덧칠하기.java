class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int point = section[0];

        for (int num : section) {
            if (point + m <= num) {
                answer++;
                point = num;
            }
        }

        return answer;
    }
}