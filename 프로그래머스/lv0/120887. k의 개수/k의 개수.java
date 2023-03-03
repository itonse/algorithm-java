class Solution {
    public int solution(int i, int j, int k) {
        int num = 0;
        int answer = 0;

        for(int a = i; a <= j; a++) {
            num = a;
            while(num > 0) {
                if(num % 10 == k) {
                    answer++;
                }
                num /= 10;
            }
        }
        
        return answer;
    }
}