import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String str1, String str2) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        for (int i = 0; i < str1.length() - 1; i++) {
            String lowerCase = str1.substring(i, i + 2).toLowerCase();
            
            if (isAlphabet(lowerCase)) {
                map1.put(lowerCase, map1.getOrDefault(lowerCase, 0) + 1);
            }
        }

        for (int i = 0; i < str2.length() - 1; i++) {
            String lowerCase = str2.substring(i, i + 2).toLowerCase();
            
            if (isAlphabet(lowerCase)) {
                map2.put(lowerCase, map2.getOrDefault(lowerCase, 0) + 1);
            }
        }

        int inter = 0;
        int union = 0;

        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) {
                inter += Math.min(map1.get(key), map2.get(key));
            }
            
            union += map1.get(key);
        }

        for (String key : map2.keySet()) {
            union += map2.get(key);
        }

        union -= inter;

        if (union == 0) {
            return 65536;
        }
        
        return (int) ((double) inter / union * 65536);
    }

    public static boolean isAlphabet(String s) {
        return s.chars().allMatch(Character::isLetter);    // 정규 표현식으로 컴파일하는 과정x
        // return s.matches("[a-zA-Z]+")    // 문자열을 정규 표현식으로 컴파일하는 과정 필요
    }
}