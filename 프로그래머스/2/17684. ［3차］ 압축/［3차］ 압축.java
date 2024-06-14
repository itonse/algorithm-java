import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] solution(String msg) {
        List<Integer> answer = new ArrayList<>();

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < 26; i++) {
            map.put(Character.toString('A' + i), i + 1);
        }

        char[] msgCharArray = msg.toCharArray();
        int lastIdx = 26;
        StringBuilder sb;
        String prev = "";
        String cur = "";

        int idx = 0;
        while (idx < msg.length()) {
            sb = new StringBuilder();
            sb.append(msgCharArray[idx]);
            prev = sb.toString();

            if (idx == msg.length() - 1) {
                answer.add(map.get(prev));
                break;
            }
            for (int idx2 = idx + 1; idx2 < msg.length(); idx2++) {
                sb.append(msgCharArray[idx2]);
                cur = sb.toString();

                if (!map.containsKey(cur)) {
                    answer.add(map.get(prev));
                    map.put(cur, ++lastIdx);
                    idx = idx2;
                    break;
                }
                if (idx2 == msg.length() - 1) {
                    answer.add(map.get(cur));
                    idx = Integer.MAX_VALUE;
                    break;
                }
                prev = cur;
            }
        }

        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}