class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;


        while(n >= a) {
            int num = n;
            int plus = num / a * b;
            answer += plus;
            n = plus + num % a;
        }
        
        return answer;
    }
}