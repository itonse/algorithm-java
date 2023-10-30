import java.util.HashSet;
import java.util.Arrays;

class Solution {
    public static int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length - 1; i++) { 
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        int[] result = set.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(result);

        return result;
    }
}