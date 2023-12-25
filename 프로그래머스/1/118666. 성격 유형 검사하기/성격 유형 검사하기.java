import java.util.HashMap;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String[][] type = {{"R", "T"}, {"C", "F"}, {"J", "M"}, {"A", "N"}};
        
        HashMap<String, Integer> map = new HashMap<>();

        String key;
        for (int idx = 0; idx < choices.length; idx++) {
            if (choices[idx] <= 3) {
                key = String.valueOf(survey[idx].charAt(0));
                map.put(key, map.getOrDefault(key, 0) + (4 - choices[idx]));
            }
            if (choices[idx] >= 5) {
                key = String.valueOf(survey[idx].charAt(1));
                map.put(key, map.getOrDefault(key, 0) + (choices[idx]) - 4);
            }
        }
        
        return makeMBTI(map, type);
    }
    
    private String makeMBTI(HashMap<String, Integer> map, String[][] type) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 4; i++) {
            int value1 = map.getOrDefault(type[i][0], 0);
            int value2 = map.getOrDefault(type[i][1], 0);

            if (value1 == value2) {
                sb.append(type[i][0].compareTo(type[i][1]) < 0 ? type[i][0] : type[i][1]);
            } else {
                sb.append(value1 > value2 ? type[i][0] : type[i][1]);
            }
        }

        return sb.toString();
    }
}