import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        HashMap<String, Integer> wantMap = new HashMap<>();
        HashMap<String, Integer> tenDaysMap = new HashMap<>();

        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        List<String> wantKeySet = new ArrayList<>(wantMap.keySet());

        for (int i = 0; i < 10; i++) {
            tenDaysMap.put(discount[i], tenDaysMap.getOrDefault(discount[i], 0) + 1);
            
            if (check(tenDaysMap, wantMap, wantKeySet)) {
                answer++;
            }
        }

        for (int idx = 10; idx < discount.length; idx++) {
            tenDaysMap.put(discount[idx], tenDaysMap.getOrDefault(discount[idx], 0) + 1);
            tenDaysMap.put(discount[idx - 10], tenDaysMap.get(discount[idx - 10]) - 1);

            if (check(tenDaysMap, wantMap, wantKeySet)) {
                answer++;
            }
        }

        return answer;
    }

    private boolean check(HashMap<String, Integer> tenDaysMap, HashMap<String, Integer> wantMap, 
                          List<String> wantKeySet) {
        for (String str : wantKeySet) {
            if (!(tenDaysMap.containsKey(str) && tenDaysMap.get(str).equals(wantMap.get(str)))) {
                return false;
            }
        }

        return true;
    }
}