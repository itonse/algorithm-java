import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max = -1;
        int subMax = -1;

        Arrays.sort(numbers);
        
        max = numbers[numbers.length - 1];
        subMax = numbers[numbers.length - 2];
        
        answer = max * subMax;
        return answer;
    }
}