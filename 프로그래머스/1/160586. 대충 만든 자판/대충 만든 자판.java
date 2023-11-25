import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        HashMap<Character, Integer> map = new HashMap();
        List<Integer> answerList = new ArrayList<>();

        for (String str : keymap) {
            for (int idx = 0; idx < str.length(); idx++) {
                if (!map.containsKey(str.charAt(idx)) || idx < map.get(str.charAt(idx))) {
                    map.put(str.charAt(idx), idx + 1);
                }
            }
        }

        for (String str : targets) {
            int cnt = 0;
            for (char ch : str.toCharArray()) {
                if (map.containsKey(ch)) {
                    cnt += map.get(ch);
                } else {
                    cnt = -1;
                    break;
                }
            }
            answerList.add(cnt);
        }

        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
}