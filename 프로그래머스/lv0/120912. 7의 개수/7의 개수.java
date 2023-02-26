class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int num = 0;
        
        for(int i = 0; i < array.length; i++) {
            num = array[i];
            
            while (num > 0) {
                if (num % 10 == 7) {
                    answer++;
                }
                
                num /= 10;
            }
        }
        
        return answer;
    }
}