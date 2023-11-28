class Solution {
    public int solution(int n) {
        int answer = 0;

        int left = 0;
        int right = 0;
        int sum = 1;
        
        while (left < n) {
            if (sum < n) {
                right++;
                sum += right + 1;
            } else if (sum > n) {
                sum -= left + 1;
                left++;
            } else {
                answer++;
                right++;
                sum += right + 1;
            }
        }

        return answer;
    }
}