class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int cnt = 0;

        for(int i: arr) {
            if (i != 0) {
                answer += i;
                cnt++;
            }
        }
        
        return answer / cnt;
    }
}