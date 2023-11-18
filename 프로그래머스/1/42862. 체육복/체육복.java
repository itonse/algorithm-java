import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        Set<Integer> lostSet = Arrays.stream(lost).boxed().collect(Collectors.toSet());
        Set<Integer> reserveSet = Arrays.stream(reserve).boxed().collect(Collectors.toSet());
        Set<Integer> lostAndReserveSet = new HashSet<>();

        for (Integer number : lostSet) {
            if (reserveSet.contains(number)) {
                answer++;
                lostAndReserveSet.add(number);
                reserveSet.remove(number);
            }
        }

        Arrays.sort(lost);

        for (Integer lostNumber : lostSet) {
            if (!lostAndReserveSet.contains(lostNumber)) {
                if (reserveSet.contains(lostNumber - 1)) {
                    answer++;
                    reserveSet.remove(lostNumber - 1);
                } else if (reserveSet.contains(lostNumber + 1)) {
                    answer++;
                    reserveSet.remove(lostNumber + 1);
                }
            }
        }

        return answer;
    }
}