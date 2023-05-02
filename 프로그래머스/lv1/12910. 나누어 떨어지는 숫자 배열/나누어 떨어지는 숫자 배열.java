import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();

        Arrays.sort(arr);

        for (int i: arr) {
            if (i % divisor == 0) {
                list.add(i);
            }
        }
        
        if (list.size() == 0) {
            list.add(-1);
        }
        
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}