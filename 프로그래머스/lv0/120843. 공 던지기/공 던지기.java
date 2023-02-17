class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int cnt = 0;
        for(int i = 0; i < k - 1; i++) {
             if((cnt + 2) >= numbers.length) {
                 cnt = (cnt + 2) % (numbers.length);
             } else{
                 cnt += 2;
             }
         }
        
         answer = numbers[cnt];
         return answer;
    }
}