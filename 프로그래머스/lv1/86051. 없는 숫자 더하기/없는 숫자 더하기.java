import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = -1;

        Arrays.sort(numbers);

        int start = numbers[0];
        int end = numbers[numbers.length - 1];
        int sum = 0;
        int sum2 = 0;

        for (int i = 0; i <= 9; i++) {
            sum += i;
        }

        for (int i: numbers) {
            sum2 += i;
        }

        answer = sum - sum2;
        return answer;
    }
}