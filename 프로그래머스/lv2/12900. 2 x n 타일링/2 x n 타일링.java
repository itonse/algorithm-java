class Solution {
    public int solution(int n) {
        int num1 = 1;
        int num2 = 2;
        int answer = 0;
        
        for (int i = 3; i <= n; i++) {
            answer = (num1 + num2) % 1000000007;
            
            num1 = num2;
            num2 = answer;
        }
        
        return answer;
    }
}