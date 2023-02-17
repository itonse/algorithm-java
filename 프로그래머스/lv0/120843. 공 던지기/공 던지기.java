class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int cnt = 0;
        for(int i = 0; i < k - 1; i++) {
            cnt += 2;
            if(cnt >= numbers.length) {
                cnt = cnt % (numbers.length);      
            }
        }

        answer = numbers[cnt];
        return answer;
    }
}