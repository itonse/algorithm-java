import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        List<Integer> list
                = Arrays.stream(numlist)
                        .boxed()
                        .collect(Collectors.toList());
        int min;
        int min_idx = -1;

        Collections.sort(list);

        for(int i = 0; i < numlist.length; i++) {
            min = Math.abs(n - list.get(0));
            min_idx = 0;

            for(int j = 1; j < list.size(); j++) {
                if (Math.abs(n - list.get(j)) <= min) {
                    min = Math.abs(n - list.get(j));
                    min_idx = j;
                }
            }
            answer[i] = list.get(min_idx);
            list.remove(min_idx);
        }
                                       
        return answer;
    }
}