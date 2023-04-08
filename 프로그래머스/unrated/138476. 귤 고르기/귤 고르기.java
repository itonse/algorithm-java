import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < tangerine.length; i++) {
            map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
        }

        int[] arr = new int[map.size()];

        int cnt = 0;
        for (int key: map.keySet()) {
            arr[cnt++] = map.get(key);
        }

        Arrays.sort(arr);

        int diff = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            k -= arr[i];
            diff++;

            if (k <= 0) {
                break;
            }
        }

        answer = diff;
        return answer;
    }
}