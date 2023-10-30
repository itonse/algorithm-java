class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while(n >= a) {
            int service = (n / a) * b;
            answer += service;
            n = n % a + service;
        }
        return answer;
    }
}