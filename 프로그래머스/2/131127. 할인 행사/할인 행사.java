import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        Map<String, Integer> target = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            target.put(want[i], number[i]);
        }

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(discount[i], map.getOrDefault(discount[i], 0) + 1);
        }

        if (check(target, map)) {
            answer++;
        }

        for (int i = 1; i < discount.length- 9; i++) {
            String previousKey = discount[i - 1];
            int end = i + 9;

            map.put(previousKey, map.getOrDefault(previousKey, 0) - 1);
            if (map.get(previousKey) == 0) {
                map.remove(previousKey);
            }
            map.put(discount[end], map.getOrDefault(discount[end], 0) + 1);

            if (check(target, map)) {
                answer++;
            }
        }

        return answer;
    }

    static boolean check(Map<String, Integer> target, Map<String, Integer> map) {
        for (String key : map.keySet()) {
            if (!target.containsKey(key) || map.get(key) != target.get(key)) {
                return false;
            }
        }
        return true;
    }
}