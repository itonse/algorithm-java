import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;

        int lastInx = topping.length - 1;

        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();

        map1.put(topping[0], map1.getOrDefault(topping[0], 0) + 1);
        for (int i = 1; i < topping.length; i++) {
            map2.put(topping[i], map2.getOrDefault(topping[i], 0) + 1);
        }

        int cutIdx = 1;
        while(cutIdx < lastInx) {
            if (map1.size() == map2.size()) {
                answer++;
            }

            map2.put(topping[cutIdx], map2.getOrDefault(topping[cutIdx], 0) - 1);
            if (map2.get(topping[cutIdx]) == 0) {
                map2.remove(topping[cutIdx]);
            }

            map1.put(topping[cutIdx], map1.getOrDefault(topping[cutIdx], 0) + 1);

            cutIdx++;
        }

        return answer;
    }
}