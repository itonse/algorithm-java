import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap();

        for (int key : tangerine) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        List<Integer> keySets = new ArrayList<>(map.keySet());

        Collections.sort(keySets, ((o1, o2) -> map.get(o2).compareTo(map.get(o1))));

        int keyPoint = 0;
        int count = 0;
        while (count < k) {
            count += map.get(keySets.get(keyPoint++));
            answer++;
        }

        return answer;
    }
}