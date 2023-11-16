import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        Map<Integer, Integer> xMap = new HashMap<>();
        Map<Integer, Integer> yMap = new HashMap<>();

        for (char ch : X.toCharArray()) {
            xMap.put(ch - '0', xMap.getOrDefault(ch - '0', 0) + 1);
        }

        for (char ch : Y.toCharArray()) {
            yMap.put(ch - '0', yMap.getOrDefault(ch - '0', 0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            if (xMap.containsKey(i) && yMap.containsKey(i)) {
                int min = Math.min(xMap.get(i), yMap.get(i));
                for (int j = 0; j < min; j++) {
                    list.add(i);
                }
            }
        }

        if (list.isEmpty()) return "-1";

        Collections.sort(list, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();

        for (int num : list) {
            sb.append(num);
        }

        Long cnt = list.stream().filter(i -> i == 0).count();
        if (cnt == list.size()) {
            return "0";
        }

        return sb.toString();
    }
}