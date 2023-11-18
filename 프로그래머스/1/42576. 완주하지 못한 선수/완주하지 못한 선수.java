import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap();
        
        for (String str : participant) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        for (String str : completion) {
            if (map.get(str) > 1) {
                map.replace(str, map.get(str) - 1);
            } else {
                map.remove(str);
            }
        }

        return map.keySet().iterator().next();
    }
}