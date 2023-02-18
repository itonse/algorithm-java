class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max = -1;
        int subMax = -1;
        int cnt = 0;
        
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] >= max) {
                max = numbers[i];
                System.out.println("max = " + max);;
            }
        }
        
        for(int j = 0; j < numbers.length; j++) {
            if(numbers[j] == max) {
                cnt++;
                if(cnt == 2) {
                    subMax = max;
                    break;
                }
            }
            else if(numbers[j] >= subMax) {
                subMax = numbers[j];
            }
        }
        
        answer = max * subMax;
        return answer;
    }
}